public class RuangPerawatan {
    private String noRuang;
    private int kapasitas;
    private KartuPerawatan kartuRawat;

    public RuangPerawatan(String noRuang, int kapasitas, KartuPerawatan kartuRawat) {
        this.noRuang = noRuang;
        this.kapasitas = kapasitas;
        this.kartuRawat = kartuRawat;
    }

    public String getNoRuang(){
        return noRuang;
    }

    public void setNoRuang(String noRuang){
        this.noRuang = noRuang;
    }
    
    public int getKapasitas(){
        return kapasitas;
    }

    public void setKapasitas(int kapasitas){
        this.kapasitas = kapasitas;
    }

    public void tampilRuang() {
        kartuRawat.tampilKartu();
        System.out.println("| No Ruang        : " + getNoRuang());
        System.out.println("| Kapasitas       : " + getKapasitas());
    }
}
