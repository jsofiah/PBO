package jobsheet_6;
public class Dosen extends Pegawai {
    public String nidn;

    public Dosen() {
        // System.out.println(gaji);
        System.out.println("Objek dari class Dosen dibuat");
    }

    public Dosen(String nip, String nama, double gaji, String nidn) {
        super.nip = nip;
        super.nama = nama;
        super.gaji = gaji;
        this.nidn = nidn;
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
