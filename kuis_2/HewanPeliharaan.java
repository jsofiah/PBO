public abstract class HewanPeliharaan {
    private String nama;
    private int energi;

    public HewanPeliharaan(String nama, int energi) {
        this.nama = nama;
        this.energi = energi;
    }

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public int getEnergi(){
        return energi;
    }
    public void setEnergi(int energi){
        this.energi = energi;
    }

    public void makan(){
        this.energi += 10;
        System.out.println(nama + " sedang makan. Energi meningkat menjadi " + energi);
    }

    public abstract void bergerak();
}
