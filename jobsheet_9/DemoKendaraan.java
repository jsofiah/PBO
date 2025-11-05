public class DemoKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 2022, "Hitam", 4);
        Motor motor = new Motor("Honda Beat", 2021, "Merah", 150);

        System.out.println("\n================================ Informasi Mobil ================================");
        mobil.tampilkanInfo();
        mobil.dinyalakan();
        mobil.dimatikan();

        System.out.println("\n================================ Informasi Motor ================================");
        motor.tampilkanInfo();
        motor.dinyalakan();
        motor.dimatikan();

        System.out.println("\n================================ Ubah Data Mobil ================================");
        mobil.setWarna("Putih");
        mobil.setTahun(2023);
        mobil.tampilkanInfo();
    }
}