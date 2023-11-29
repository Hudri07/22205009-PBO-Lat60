package pkg22205009.pbo.lat60;

/**
 * Nama : Asmalik Hudri 
 * Prodi : Teknik Informatika 
 * Semester : 3 
 * Matakuliah :Pemrograman Berorientasi Objek (PBO)
 */


// Kelas dasar yang merepresentasikan Akatsuki
class Akatsuki {

    protected String pakaian;   // Variabel untuk menyimpan informasi pakaian anggota Akatsuki
    protected String tugas;     // Variabel untuk menyimpan informasi tugas anggota Akatsuki

    // Konstruktor untuk kelas Akatsuki
    public Akatsuki(String pakaian, String tugas) {
        this.pakaian = pakaian;
        this.tugas = tugas;
    }

    // MethodGetter untuk mendapatkan informasi pakaian anggota Akatsuki
    public String getPakaian() {
        return pakaian;
    }

    // Method Getter untuk mendapatkan informasi tugas anggota Akatsuki
    public String getTugas() {
        return tugas;
    }
    
}

// Kelas turunan yang merepresentasikan anggota Akatsuki dengan atribut tambahan
class Anggota extends Akatsuki{
    
    private String nama;            // Variabel untuk menyimpan informasi nama anggota Akatsuki
    private String asal;            // Variabel untuk menyimpan informasi asal anggota Akatsuki
    private String posisiCincin;    // Variabel untuk menyimpan informasi posisi cincin anggota Akatsuki
    private String ciriKhas;        // Variabel untuk menyimpan informasi ciri khas anggota Akatsuki
    
    // Konstruktor untuk kelas Anggota yang memanggil konstruktor kelas Akatsuki menggunakan "super"
    public Anggota(String nama, String asal, String posisiCincin, String ciriKhas, String pakaian, String tugas){
        super(pakaian, tugas);
        this.nama = nama;
        this.asal = asal;
        this.posisiCincin = posisiCincin;
        this.ciriKhas = ciriKhas;
    }
    
    // Method Getter untuk mendapatkan informasi nama anggota Akatsuki
    public String getNama(){
        return nama;
    }
    
    // Method Getter untuk mendapatkan informasi asal anggota Akatsuki
    public String getAsal(){
        return asal;
    }
    
    // Method Getter untuk mendapatkan informasi posisi cincin anggota Akatsuki
    public String getPosisiCincin(){
        return posisiCincin;
    }
    
    // Getter untuk mendapatkan informasi ciri khas anggota Akatsuki
    public String getCiriKhas(){
        return ciriKhas;
    }
    
     // Metode untuk menampilkan informasi lengkap tentang anggota Akatsuki
    public void displayAnggota(){
        System.out.println("Nama \t\t: " + getNama());
        System.out.println("Asal \t\t: " + getAsal());
        System.out.println("Posisi Cincin\t: " + getPosisiCincin());
        System.out.println("Ciri Khas\t: " + getCiriKhas());
        System.out.println("Penampilan\t: " + getPakaian());
        System.out.println("Tugas \t\t: " + getTugas() + "\n");
    }
    
}

// Kelas utama yang berisi metode main untuk menjalankan program
public class PBOLat60 {
    
    public static void main(String[] args) {
        // Menampilkan informasi awal tentang Akatsuki
        System.out.println("Akatsuki awalnya didirikan oleh Yahiko selama Perang Dunia Shinobi Ketiga.");
        System.out.println("Terdiri dari Ninja Amegakure yang ingin menciptakan perdamaian untuk negara asal mereka.");
        System.out.println("Setelah kematian Yahiko dan transisi Nagato ke Pain, tujuan Akatsuki bergeser dengan dominasi dunia.\n");
        
        System.out.println("===== ANGGOTA AKATSUKI =====");
        
        // Membuat objek-objek Anggota Akatsuki dan menampilkan informasi mereka
        Anggota yahiko = new Anggota("Yahiko", "Amegakure", "Jempol Kanan", 
                "Rambut lancip, memiliki seperti tindikan di hidung, rambut berwarna jingga",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menciptakan perdamaian, dan membangun negeri mereka menjadi lebih baik.");
        yahiko.displayAnggota();
        
        Anggota nagato = new Anggota("Nagato", "Amegakure", "Jempol Kanan", 
                "Rambut menutupi setengah mata, memiliki mata rinnegan, rambut berwarna merah",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menciptakan perdamaian, dan membangun negeri mereka menjadi lebih baik.");
        nagato.displayAnggota();
        
        Anggota konan = new Anggota("Konan", "Amegakure", "Jari tengah, Tangan kanan", 
                "Memiliki aksesoris origami bunga di kepala, berambut biru",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menciptakan perdamaian, dan membangun negeri mereka menjadi lebih baik.");
        konan.displayAnggota();
        
        Anggota zetsu = new Anggota("Zetsu", "Tidak ada", "Kelingking kanan", 
                "Berwajah hitam dan putih, mempunyai dua kepribadian, kanibal, "
                        + "memiliki kerudung kepala seperti tumbuhan venus",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menjadi pengintai selama ritual penyegelan Bijuu, kebangkitan kembali Kaguya, "
                        + "yang dapat ia capai. ");
        zetsu.displayAnggota();
        
        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure", "Jari manis kiri", 
                "Memiliki kulit seperti ikan hiu, bergigi seperti ikan hiu",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap Jinchuuriki siluman berekor empat");
        kisame.displayAnggota();
        
        Anggota tobi = new Anggota("Tobi/Obito Uchiha", "Kohonagakure", "Jempol kiri", 
                "Topeng jingga dengan satu lubang mata dengan pola pusaran yang"
                        + " terpusat pada mata kanan",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Untuk membantu mewujudkan tujuan utama Madara Uchiha.");
        tobi.displayAnggota();
        
        Anggota deidara = new Anggota("Deidara", "Iwagakure", "Telunjuk Kanan", 
                "Rambut pirang dan dikuncir, spesialis ledakan menggunakan tanah liat dengan"
                        + " mulut di telapak tangan dan dada",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Bertaruh bahwa jika Itachi dapat mengalahkannya, dia akan bergabung dengan kelompok tersebut.");
        deidara.displayAnggota();
        
        Anggota hidan = new Anggota("Hidan", "Yugakure", "Telunjuk Kir", 
                "Tidak bisa mati,membawa sabit besar bermata tiga, rambut cepak"
                        + " berwarna pucat",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "etelah melihat Kakuzu, seorang pria yang ia anggap sebagai pelopor dalam keabadian, "
                        + "Hidan bergabung dengan organisasi Akatsuki ");
        hidan.displayAnggota();
        
        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure", "Jari tengah kiri", 
                "Memakai penutup wajah, dapat memperpanjang hidupnya dengan cara "
                        + "mengambil jantung manusia, dapat memiliki lima jantung "
                        + "manusia secara bersamaan.",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Untuk mendapatkan uang dan mengumpulkan jantung untuk hidup abadinya.");
        kakuzu.displayAnggota();
        
        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure/Otogakure", "Telunjuk Kelingking kiri", 
                "Berambut panjang berwarna hitam, berkulit pucat",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Untuk memperoleh Rinnegan dari Pain, dan kemudian Sharingan punya Itachi. ");
        orochimaru.displayAnggota();
        
        Anggota sasori = new Anggota("Sasori", "Sunagakure", "Jempol kiri", 
                "Berambut pendek berwarna merah. Bertubuh boneka sehingga tidak bisa"
                        + " menua dan juga ahli racun",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Karena Konan mengalahkannya, Sasori memutuskan gabung akatsuki");
        sasori.displayAnggota();
        
        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "Jari manis kanan", 
                "Berambut belah tengah, ahli dalam Genjutsu, memakai sharingan dan"
                        + " mangekyo sharingan",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Untuk menguasai kekuatan Biju, dapat terus melindungi desanya, "
                        + "Konoha, dengan mengawasi kegiatan para petinggi Konoha, terutama Sasuke, secara tidak langsung dari luar.");
        itachi.displayAnggota();
        
    }
    
}
