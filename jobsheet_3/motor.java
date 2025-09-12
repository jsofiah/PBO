package jobsheet_3;

public class motor{
    private String platNomor;
    private boolean isMesinon;
    private int kecepatan;

    public String getPlatNomor(){
        return platNomor;
    }

    public void setPlatNomor(String platNomor){
        this.platNomor = platNomor;
    }

    public boolean isIsMesinOn(){
        return isMesinon;
    }

    public void setIsMesinOn(boolean isMesinon){
        this.isMesinon = isMesinon;
    }

    public int getKecepatan(){
        return kecepatan;
    }

    public void setKecepatan(int kecepatan){
        if (!this.isMesinon && kecepatan > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            this.kecepatan = kecepatan;
        }
    }

    public void displayStatus(){
        System.out.println("Plat Nomor: " + this.platNomor);

        if(isMesinon){
            System.out.println("Mesin on");
        } else {
            System.out.println("Mesin off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("==============================");
    }
}