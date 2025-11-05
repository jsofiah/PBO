public class Mobil extends Kendaraan implements IBisaDinyalakan, IIsiBahanBakar {
    public int jumlahPintu;

    public Mobil(String merek, int tahun, String warna, int jumlahPintu) {
        super(merek, tahun, warna);
        this.jumlahPintu = jumlahPintu;
    }

    public void dinyalakan() {
        System.out.println("Mobil " + getMerek() + " menyalakan mesin dengan tombol start.");
    }
    public void dimatikan() {
        System.out.println("Mobil " + getMerek() + " mematikan mesin dengan tombol stop.");
    }

    public void isiBahanBakar(){
        System.out.println("Mobil " + getMerek() + " sedang mengisi bahan bakar dengan Solar");
    }
}
