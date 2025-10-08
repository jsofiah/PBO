public class Dosen extends Pegawai{
    public String nidn;

    public Dosen() {
        // System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    // public Dosen(String nip, String nama, double gaji,String nidn) {
    //     System.out.println("Objek dari class Dosen dibuat dengan constructor berparameter");
    // }
    public Dosen(String nip, String nama, double gaji,String nidn) {
        this.nidn = nidn;
        super(nip, nama, gaji);
    }

    public String getInfo(){
        return "NIDN        : " + this.nidn + "\n";
    }

    public String getAllInfo(){
        String info = super.getInfo();
        info += this.getInfo();
        return info;
    }
}
