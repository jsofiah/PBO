public class Mobil extends Kendaraan{
    public int jumlahPintu;
    public String jenisBahanBakar;

    public Mobil() {
        System.out.println("Objek dari class Mobil dibuat");
    }

    public Mobil(String merk, String jenis, int tahun, int jumlahPintu, String jenisBahanBakar) {
        super(merk, jenis, tahun);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }
    
    public String getInfo() {
        return super.getInfo() + "Jumlah Pintu : " + jumlahPintu + "\n" + "Bahan Bakar  : " + jenis + "\n";
    }
}
