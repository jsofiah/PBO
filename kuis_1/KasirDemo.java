package kuis_1;

public class KasirDemo {
    public static void main(String[] args) {
        Produk p1 = new Produk("P01", "Mie Ayam", 8000);
        Produk p2 = new Produk("P02", "Es Jeruk", 5000);
        Produk p3 = new Produk("P03", "Dimsum", 2000);
        Produk p4 = new Produk("P04", "Bakso", 10000);

        Transaksi transaksi1 = new Transaksi("2025-09-26");
        transaksi1.tambahItem(p1, 2);
        transaksi1.tambahItem(p2, 2);
        transaksi1.tambahItem(p3, 6);

        Transaksi transaks2 = new Transaksi("2025-09-27");
        transaks2.tambahItem(p4, 1);
        transaks2.tambahItem(p2, 1);

        transaksi1.tampilNota();
        transaks2.tampilNota();
    }
}
