public class Kendaraan {
    public String merk;
    public String jenis;
    public int tahun;

    public Kendaraan() {
        System.out.println("Objek dari class Kendaraan dibuat");
    }

    public Kendaraan(String merk, String jenis, int tahun) {
        this.merk = merk;
        this.jenis = jenis;
        this.tahun = tahun;
    }

    public String getInfo(){
        String info = "";
        info += "Merk         : " + merk + "\n";
        info += "Jenis        : " + jenis + "\n";
        info += "Tahun        : " + tahun + "\n";
        return info;
    }
}
