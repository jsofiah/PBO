package kuis_1;
import java.util.ArrayList;
public class Transaksi {
    private String tanggal;
    private ArrayList<ItemTransaksi> daftarItem;
    private double total;

    public Transaksi(String tanggal) {
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
        this.total = 0;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void tambahItem(Produk p, int jumlah) {
        ItemTransaksi item = new ItemTransaksi(p, jumlah);
        daftarItem.add(item);
    }

    public void hitungTotal() {
        total = 0;
        for (ItemTransaksi item : daftarItem) {
            total += item.hargaPerProduk();
        }
    }

    public void tampilNota() {
        System.out.println("============= Nota Transaksi =============");
        System.out.println("| Tanggal: " + tanggal);
        System.out.println("==========================================");
        for (ItemTransaksi item : daftarItem) {
            System.out.println(item.infoItem());
        }

        hitungTotal();
        System.out.println("==========================================");
        System.out.println("| Total Bayar anda sebesar Rp. " + total);
    }
}
