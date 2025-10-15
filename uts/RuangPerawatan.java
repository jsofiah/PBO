import java.util.ArrayList;

public class RuangPerawatan {
    private String noRuang;
    private int kapasitas;
    private ArrayList<KartuPerawatan> kartuRawat;

    public RuangPerawatan(String noRuang, int kapasitas) {
        this.noRuang = noRuang;
        this.kapasitas = kapasitas;
        this.kartuRawat = new ArrayList<>();
    }

    public String getNoRuang(){
        return noRuang;
    }

    public void tambahKartu(KartuPerawatan kartu) {
        kartuRawat.add(kartu);
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
        for (KartuPerawatan k : kartuRawat) {
            k.tampilKartu();
        }
        System.out.println("| No Ruang        : " + getNoRuang());
        System.out.println("| Kapasitas       : " + getKapasitas());
    }
}
