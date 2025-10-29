public class Motor extends Kendaraan {
    public int kapasitasMesin;

    public Motor(String nama, String merk, int tahun, int kapasitasMesin) {
        super(nama, merk, tahun);
        this.kapasitasMesin = kapasitasMesin;
    }

    public void bergerak(){
        System.out.println(nama + " sedang melaju di jalan raya dengan dua roda");
    }

    public void bahanBakar(){
        System.out.println(nama + " menggunakan bahan bakar pertalite");
    }

    public void info(){
        super.info();
        System.out.println("Kapasitas Mesin   : " + kapasitasMesin);
    }
}
