public class Mobil extends Kendaraan implements IMenyala, IBergerak {
    public int jumlahPintu;

    public Mobil(String merek, int tahun, String warna, int jumlahPintu) {
        super(merek, tahun, warna);
        this.jumlahPintu = jumlahPintu;
    }

    public void starter() {
        System.out.println("Mobil " + getMerek() + " dikatakan menyala jika dapat dinyalakan melalui tombol start.");
    }
    public void dimatikan() {
        System.out.println("Mobil " + getMerek() + " dikatakan menyala jika mesinnya bisa dimatikan dengan tombol stop.");
    }

    public void mesin(){
        System.out.println("Mobil " + getMerek() + " dikatakan bergerak jika memiliki mesin");
    }
    public void roda(){
        System.out.println("Mobil " + getMerek() + " dikatakan bergerak jika memiliki roda dengan jumlah 4");
    }
}
