class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean vipCard;
    
    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP (int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard ;
    }
            
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)

    public void KomputerVIPInfo () {
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet : " + namaWarnet);
        System.out.println("Harga Per Jam : " + hargaPerJam);
        if (vipCard) {
            System.out.println("Diskon 10% untuk bermain diatas 3 jam");
            System.out.println("Gratis minum setiap 4 jam bermain") ;
            System.out.println("Proritas booking komputer gaming") ;}
        else {
            System.out.println("jgn ngarep benefit, maav") ;
        }

    }    
    // To do: Buatlah method Login sesuai dengan ketentuan
    public void login(String username) {
        System.out.println("Login dengan username : " + username);
    }
    
    // To do: Buatlah method Bermain sesuai dengan ketentuan
    public void bermain(int jam) {
        System.out.println("Bermain selama : " + jam);
    }
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan
    public void bermain (int jam, int menitTambahan) {
        System.out.println("Nambah Billing Selama : " + jam + menitTambahan);
        
    }


}