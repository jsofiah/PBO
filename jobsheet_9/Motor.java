public class Motor extends Kendaraan implements IMenyala, IBergerak {
    public int kapasitasMesin;

    public Motor(String merek, int tahun, String warna, int kapasitasMesin) {
        super(merek, tahun, warna);
        this.kapasitasMesin = kapasitasMesin;
    }

    public void starter() {
        System.out.println("Motor " + getMerek() + " dikatakan bisa menyala jika mesinnya dapat dinyalakan dengan kick starter atau electric starter.");
    }
    public void dimatikan() {
        System.out.println("Motor " + getMerek() + " dikatakan bisa menyala ketika mesin bisa dimatikan dengan memutar kunci kontak ke posisi OFF.");
    }

    public void mesin(){
        System.out.println("Mobil " + getMerek() + " dikatakan bergerak jika memiliki mesin");
    }
    public void roda(){
        System.out.println("Mobil " + getMerek() + " dikatakan bergerak jika memiliki roda dengan jumlah 2");
    }
}
