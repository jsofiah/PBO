package kuis_1;
import java.util.ArrayList;
public class Reservasi {
    private String tanggal;
    private int durasi;
    private Ruangan ruangan;
    private ArrayList<Mahasiswa> listMhs;

    public Reservasi(String tanggal, int durasi, Ruangan ruangan) {
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.ruangan = ruangan;
        this.listMhs = new ArrayList<>();
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    public void tambahMahasiswa(Mahasiswa mhs){
        listMhs.add(mhs);
    }

    public void tampilReservasi() {
        System.out.println("====== Data Reservasi Ruangan =====");
        System.out.println("| Tanggal: " + tanggal);
        System.out.println("| Durasi: " + durasi + " jam");
        System.out.println("| Ruangan: " + ruangan.tampilInfo());
        System.out.println("Daftar Mahasiswa: ");
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs.tampilInfo());
        }
    }
}
