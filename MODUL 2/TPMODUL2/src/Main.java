public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan");

        Kucing kucing = new Kucing("Momo", 2, "Persia");
        System.out.println("\nini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");
        kucing.infoHewan();

        Burung burung = new Burung("Rio", 1, "Hijau");
        System.out.println("\nini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");
        burung.infoHewan();
    }
}