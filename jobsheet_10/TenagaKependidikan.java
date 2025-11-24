public class TenagaKependidikan extends Pegawai {
    public String kategori;

    public TenagaKependidikan() {
    }

    public TenagaKependidikan(String kategori, String nip, String nama) {
        super(nip, nama);
        this.kategori = kategori;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kategori    : " + kategori);
    }
}