public class KartuPerawatan {
    private String noKartu;
    private String tanggal;

    public KartuPerawatan(String noKartu, String tanggal) {
        this.noKartu = noKartu;
        this.tanggal = tanggal;
    }

    public String getNoKartu(){
        return noKartu;
    }

    public void setNoKartu(String noKartu){
        this.noKartu = noKartu;
    }

    public String getTanggal(){
        return tanggal;
    }

    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }

    public void tampilKartu() {
        System.out.println("====== Kartu Perawatan ======");
        System.out.println("| No Kartu        : " + getNoKartu());
        System.out.println("| Tanggal         : " + getTanggal());
    }
}
