class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivate;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium (int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivate) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivate = ruangPrivate ;
    };   
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void KomputerPremiumInfo () {
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet : " + namaWarnet);
        System.out.println("Harga Per Jam : " + hargaPerJam);
        if (ruangPrivate) {
            System.out.println("Ruangan ber-AC pribadi");
            System.out.println("Sofa gaming exclusive") ;
            System.out.println("Koneksi internet dedicated 100Mbps") ;
            System.out.println("Komputer spesifikasi tinggi") ;}
        else {
            System.out.println("Ruangan gerah") ;
            System.out.println("Sofa majapahit") ;
            System.out.println("Komputer spesifikasi rendah") ;
            System.out.println("Koneksi internet dedicated 1Mbps") ;
        }

    }      
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer) {
        System.out.println("Memesan komputer nomor" + nomorKomputer) ;
        
    }    
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan) {
        System.out.println("Menambah layanan makanan" + makanan) ;
    }
    
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minumam) {
        System.out.println("Menambah layanan makanan: " + makanan "Minumam:" + minumam) ;
    }
    
}
