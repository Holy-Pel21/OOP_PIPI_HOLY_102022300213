import java.time.LocalDate;

public class Task {
    // TO DO: Lengkapi atribut-atribut private kelas Task
    private final LocalDate dueDate;
    private String title ;
    private String priority ;
    private String status ;
    
    public Task(LocalDate dueDate, String title, String priority, String status) {
        this.dueDate = dueDate;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    public String getTitle() {
        return title;
    }
    public String getPriority() {
        return priority;
    }
    public String getStatus() {
        return status;
    }

    // TO DO: Buat constructor untuk kelas Task
    
    // TO DO: Buat getter untuk title
    
    // TO DO: Buat getter untuk priority

    // TO DO: Buat getter untuk dueDate

    // TO DO: Buat getter untuk status
    
    // TO DO: Buat setter untuk status
    
}
