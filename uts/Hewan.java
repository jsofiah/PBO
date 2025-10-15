public class Hewan {
    private String nama;
    private int usia;
    private String ras;

    public Hewan(String nama, int usia, String ras) {
        this.nama = nama;
        this.usia = usia;
        this.ras = ras;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUsia(){
        return usia;
    }

    public void setUsia(int usia){
        this.usia = usia;
    }

    public String getRas(){
        return ras;
    }

    public void setRas(String ras){
        this.ras = ras;
    }

    public void tampilInfoHewan(){
        System.out.println("| Nama Hewan      : " + getNama());
        System.out.println("| Usia Hewan      : " + getUsia());
        System.out.println("| Ras Hewan       : " + getRas());
    }
}
