public class DemoKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 2022, "Hitam", 4);
        Motor motor = new Motor("Honda Beat", 2021, "Merah", 150);

        System.out.println("\n================================ Informasi Mobil ================================");
        mobil.tampilkanInfo();
        mobil.starter();
        mobil.dimatikan();
        mobil.mesin();
        mobil.roda();

        System.out.println("\n================================ Informasi Motor ================================");
        motor.tampilkanInfo();
        motor.starter();
        motor.dimatikan();
        motor.mesin();
        motor.roda();

        System.out.println("\n================================ Ubah Data Mobil ================================");
        mobil.setWarna("Putih");
        mobil.setTahun(2023);
        mobil.tampilkanInfo();
    }
}