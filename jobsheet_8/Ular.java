public class Ular extends Hewan {
    public boolean isBerbisa;

    public Ular(boolean isBerbisa, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.isBerbisa = isBerbisa;
    }

    @Override
    public void bergerak(){
        System.out.println("Mengerutkan otot dari megala sisi hingga membentuk Lengkungan");
        System.out.println("Menemokan titik penahan seperti batu atau pohon");
        System.out.println("Menggunakan sisik untuk mendorong tubah ke depan");
    }

    @Override
    public void bernafas(){
        System.out.println("Otot tulang rusuk kontraksi, udara masuk lowat hidung");
        System.out.println("Trakea mengirimkan udara ke paru-paru");
        System.out.println("Otot tulang ruank relaksasi, udara dikeluatkan lowat hidung");
    }

    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println ("Berbisa    : " + (this.isBerbisa ? "Ya" : "Tidak"));
    }
}
