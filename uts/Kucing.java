public class Kucing extends Hewan {
    private String warna;

    public Kucing(String nama, int usia, String ras, String warna) {
        super(nama, usia, ras);
        this.warna = warna;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String Warna){
        this.warna = warna;
    }

    public void tampilInfoHewan(){
        super.tampilInfoHewan();
        System.out.println("| Warna           : " + getWarna());
    }

    public void makan(){
        System.out.println("| Hewan kucing dengan nama " + super.getNama() + " sedang makan");
    }

    public void makan(String makanan){
        System.out.println("| Hewan kucing dengan nama " + super.getNama() + " sedang makan " + makanan);
    }
}
