public class KendaraanMain {
    public static void main(String[] args) {
        Motor mtr = new Motor("NMAX", "Yamaha", 2022, 155);
        mtr.info();
        mtr.bergerak();
        mtr.bahanBakar();
        mtr.nyalakanMesin();

        System.out.println();

        Mobil mbl = new Mobil("Avanza", "Toyota", 2020, 4);
        mbl.info();
        mbl.bergerak();
        mbl.bahanBakar();
        mbl.nyalakanMesin();
    }
}