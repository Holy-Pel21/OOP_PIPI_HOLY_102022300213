public class Makanan {
    private String nama ;
    private int jumlah ;
    private double harga; 

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
// Todo : Create private attribute of Makanan (nama, jumlah, and harga)
public Makanan(String nama,int jumlah, double harga){
    this.nama = nama;
    this.jumlah = jumlah;
    this.harga = harga;
}
    // Todo : Create Constructor of Makanan

    // Todo : Create Getter and Setter

}
