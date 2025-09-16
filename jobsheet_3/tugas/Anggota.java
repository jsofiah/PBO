package jobsheet_3.tugas;

public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjam;
    private int jumlahPinjam;

    public Anggota(String noKTP, String nama, int limitPinjam) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
        this.jumlahPinjam = 0;
    }

    public String getNama(){
        return nama;
    }

    public int getLimitPinjaman(){
        return limitPinjam - jumlahPinjam;
    }

    public void pinjam(int jumlah){
        if(jumlah + jumlahPinjam > limitPinjam){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jumlahPinjam += jumlah;
        }
    }

    public int getJumlahPinjaman(){
        return jumlahPinjam;
    }

    public void angsur(int jmlAngsur){
        if (jmlAngsur < (0.1 * jumlahPinjam)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            jumlahPinjam -= jmlAngsur;
            if (jumlahPinjam < 0) {
                jumlahPinjam = 0;
            }
        }
    }
}
