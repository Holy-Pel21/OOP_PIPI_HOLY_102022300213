import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InventoryController {

    @FXML
    private TableView<Album> tableView;
    @FXML
    private TextField albumNameField;
    @FXML
    private TextField artistField;
    @FXML
    private TextField totalField;
    @FXML
    private TextField availableField;

    private ObservableList<Album> albumList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        tableView.setItems(albumList);
        tableView.setOnMouseClicked(this::handleTableSelection);
    }

    private void handleTableSelection(MouseEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumNameField.setText(selectedAlbum.getAlbumName());
            artistField.setText(selectedAlbum.getArtist());
            totalField.setText(String.valueOf(selectedAlbum.getTotal()));
            availableField.setText(String.valueOf(selectedAlbum.getAvailable()));
        }
    }

    @FXML
    private void handleAddAlbum(ActionEvent event) {
        try {
            String name = albumNameField.getText();
            String artist = artistField.getText();
            int total = Integer.parseInt(totalField.getText());
            int available = Integer.parseInt(availableField.getText());

            Album newAlbum = new Album(name, artist, total, available, 0);
            albumList.add(newAlbum);

            showAlert("Success", "Album added successfully.");
        } catch (Exception e) {
            showAlert("Error", "Invalid data. Please check your input.");
        }
    }

    @FXML
    private void handleUpdateAlbum(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(albumNameField.getText());
                selectedAlbum.setArtist(artistField.getText());
                selectedAlbum.setTotal(Integer.parseInt(totalField.getText()));
                selectedAlbum.setAvailable(Integer.parseInt(availableField.getText()));
                tableView.refresh();
                showAlert("Success", "Album updated successfully.");
            } catch (Exception e) {
                showAlert("Error", "Invalid data. Please check your input.");
            }
        }
    }

    @FXML
    private void handleDeleteAlbum(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showAlert("Success", "Album deleted successfully.");
        } else {
            showAlert("Error", "No album selected.");
        }
    }

    @FXML
    private void handleRentAlbum(ActionEvent event) {
        Album selectedAlbum = tableView.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null && selectedAlbum.getAvailable() > 0) {
            selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
            selectedAlbum.setRented(selectedAlbum.getRented() + 1);
            tableView.refresh();
            showAlert("Success", "Album rented successfully.");
        } else {
            showAlert("Error", "No album selected or album unavailable.");
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
