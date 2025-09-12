package jobsheet_3;

public class motor{
    public String platNomor;
    public boolean isMesinon;
    public int kecepatan;

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