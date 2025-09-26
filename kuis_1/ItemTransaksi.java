package kuis_1;

public class ItemTransaksi {
    private Produk produk;
    private int jumlah;

    public ItemTransaksi(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double hargaPerProduk() {
        return produk.getHarga() * jumlah;
    }

    public String infoItem() {
        return produk.getNamaProduk() + " x" + jumlah + " = Rp " + hargaPerProduk();
    }
}