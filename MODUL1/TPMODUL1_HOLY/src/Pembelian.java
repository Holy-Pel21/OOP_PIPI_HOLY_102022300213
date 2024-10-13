import java.util.ArrayList;
import java.util.Scanner;

// Class Penerbangan
class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    // Constructor
    public Penerbangan(String nomorPenerbangan, String bandaraKeberangkatan, String bandaraTujuan, String waktuKeberangkatan, String waktuKedatangan, float hargaTiket) {
        this.nomorPenerbangan = nomorPenerbangan;
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
        this.hargaTiket = hargaTiket;
    }

    // Getter methods
    public String getNomorPenerbangan() {
        return nomorPenerbangan;
    }

    public String getBandaraKeberangkatan() {
        return bandaraKeberangkatan;
    }

    public String getBandaraTujuan() {
        return bandaraTujuan;
    }

    public String getWaktuKeberangkatan() {
        return waktuKeberangkatan;
    }

    public String getWaktuKedatangan() {
        return waktuKedatangan;
    }

    public float getHargaTiket() {
        return hargaTiket;
    }

    // Method to display flight details
    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan);
        System.out.println("Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan);
        System.out.println("Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp " + hargaTiket);
        System.out.println();
    }
}

// Class Penumpang
class Penumpang {
    private String NIK;
    private String namaDepan;
    private String namaBelakang;

    // Constructor
    public Penumpang(String NIK, String namaDepan, String namaBelakang) {
        this.NIK = NIK;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    // Method to display passenger details
    public void tampilDaftarPenumpang() {
        System.out.println("NIK: " + NIK);
        System.out.println("Nama: " + namaDepan + " " + namaBelakang);
    }
}

// Class Pembelian (Main Class)
public class Pembelian {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // List to store available flights
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        // Variables to store selected passenger and flight
        Penumpang penumpang = null;
        Penerbangan penerbanganTerpilih = null;

        // Main menu loop
        while (true) {
            System.out.println("\n======= EAD Ticket Booking System =======");
            System.out.println("1. Tampilkan Daftar Penerbangan");
            System.out.println("2. Beli Tiket");
            System.out.println("3. Tampilkan Pesanan Tiket");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (menu) {
                case 1:
                    // Display flight list
                    System.out.println("\nDaftar Penerbangan Tersedia:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println("[" + (i + 1) + "] ");
                        daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                    }
                    break;

                case 2:
                    // Input passenger data
                    System.out.print("Masukkan NIK: ");
                    String nik = scanner.nextLine();
                    System.out.print("Masukkan Nama Depan: ");
                    String namaDepan = scanner.nextLine();
                    System.out.print("Masukkan Nama Belakang: ");
                    String namaBelakang = scanner.nextLine();
                    penumpang = new Penumpang(nik, namaDepan, namaBelakang);

                    // Select flight
                    System.out.println("\nPilih Penerbangan yang Ingin Dipesan:");
                    for (int i = 0; i < daftarPenerbangan.size(); i++) {
                        System.out.println("[" + (i + 1) + "] " + daftarPenerbangan.get(i).getNomorPenerbangan());
                    }
                    System.out.print("Masukkan nomor penerbangan: ");
                    int pilihanPenerbangan = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    penerbanganTerpilih = daftarPenerbangan.get(pilihanPenerbangan - 1);

                    System.out.println("Tiket berhasil dipesan!");
                    break;

                case 3:
                    // Display ticket details
                    if (penumpang == null || penerbanganTerpilih == null) {
                        System.out.println("Belum ada tiket yang dipesan.");
                    } else {
                        System.out.println("\n======= Detail Tiket =======");
                        penumpang.tampilDaftarPenumpang();
                        penerbanganTerpilih.tampilDaftarPenerbangan();
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
