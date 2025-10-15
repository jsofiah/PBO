public class Anjing extends Hewan {
    private String jenisHewan;

    public Anjing(String nama, int usia, String ras, String jenisHewan) {
        super(nama, usia, ras);
        this.jenisHewan = jenisHewan;
    }

    public String getJenisHewan(){
        return jenisHewan;
    }

    public void setJenisHewan(String jenisHewan){
        this.jenisHewan = jenisHewan;
    }

    public void tampilInfoHewan(){
        super.tampilInfoHewan();
        System.out.println("| Jenis Hewan     : " + getJenisHewan());
    }

    public void minum(){
        System.out.println("| Hewan kucing dengan nama " + super.getNama() + " sedang minum");
    }

    public void minum(String minum){
        System.out.println("| Hewan kucing dengan nama " + super.getNama() + " sedang minum " + minum);
    }
}
