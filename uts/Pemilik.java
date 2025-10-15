public class Pemilik {
    private String nama;
    private String alamat;

    public Pemilik(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String infoPemilik(){
        return nama + " (" + alamat + ")";
    }
}