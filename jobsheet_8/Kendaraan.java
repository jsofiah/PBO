public abstract class Kendaraan {
    public String nama;
    public String merk;
    public int tahun;

    public Kendaraan(String nama, String merk, int tahun) {
        this.nama = nama;
        this.merk = merk;
        this.tahun = tahun;
    }

    public abstract void bergerak();
    public abstract void bahanBakar();
    
    public void nyalakanMesin(){
        System.out.println(nama + " sedang menyalakan mesin");
    }

    public void info(){
        System.out.println("========== INFO ==========");
        System.out.println("Nama    : " + nama);
        System.out.println("Merk    : " + merk);
        System.out.println("Tahun   : " + tahun);
    }
}