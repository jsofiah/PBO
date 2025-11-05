public class Kendaraan {
    private String merek;
    private int tahun;
    private String warna;

    public Kendaraan(String merek, int tahun, String warna) {
        this.merek = merek;
        this.tahun = tahun;
        this.warna = warna;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void tampilkanInfo() {
        System.out.println("Merek  : " + merek);
        System.out.println("Tahun  : " + tahun);
        System.out.println("Warna  : " + warna);
    }

}
