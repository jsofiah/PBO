public class Mobil extends Kendaraan{
    public int jumlahPintu;

    public Mobil(String nama, String merk, int tahun, int jumlahPintu) {
        super(nama, merk, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    public void bergerak(){
        System.out.println(nama + " sedang melaju di jalan raya dengan empat roda");
    }

    public void bahanBakar(){
        System.out.println(nama + " menggunakan bahan bakar solar");
    }

    public void info(){
        super.info();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}