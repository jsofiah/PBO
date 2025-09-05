package tugas;

public class Buku {
    public int idBuku;
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public int jumlahHalaman;
    public String sinopsis;

    public void tampilInfoBuku(){
        System.out.println("\nInformasi Buku " + judul);
        System.out.println("====================================");
        System.out.println("Id Buku         : " + idBuku);
        System.out.println("Judul           : " + judul);
        System.out.println("Penulis         : " + penulis);
        System.out.println("Tahun Terbit    : " + tahunTerbit);
        System.out.println("Jumlah Halaman  : " + jumlahHalaman);
        System.out.println("Usia Buku       : " + getHitungUsia(2025));
        System.out.println("====================================");
    }

    public void ubahJudul(String judulBaru){
        judul = judulBaru;
    }

    public void tampilSinopsis(){
        System.out.println("\nSinopsis Buku " + judul);
        System.out.println("====================================");
        System.out.println(sinopsis);
    }

    public int getHitungUsia(int tahunSekarang){
        return tahunSekarang - tahunTerbit;
    }
}
