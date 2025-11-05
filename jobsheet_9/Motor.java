public class Motor extends Kendaraan implements IBisaDinyalakan {
    public int kapasitasMesin;

    public Motor(String merek, int tahun, String warna, int kapasitasMesin) {
        super(merek, tahun, warna);
        this.kapasitasMesin = kapasitasMesin;
    }

    public void dinyalakan() {
        System.out.println("Motor " + getMerek() + " menyalakan mesin dengan menggunakan kick starter.");
    }
    public void dimatikan() {
        System.out.println("Motor " + getMerek() + " mematikan mesin dengan memutar kunci kontak ke posisi OFF.");
    }
}
