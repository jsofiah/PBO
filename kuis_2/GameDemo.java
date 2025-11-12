public class GameDemo {
    public static void main(String[] args) {
        KucingVirtual kucing = new KucingVirtual("Sesil", 40);
        IkanVirtual ikan = new IkanVirtual("Blui", 30);
        AnjingVirtual anjing = new AnjingVirtual("Bond", 35);

        BurungVirtual burung = new BurungVirtual("Nuri", 20);

        System.out.println("================================================================================");
        System.out.println("                        Game Peliharaan Virtual");
        System.out.println("================================================================================");
        System.out.println("Aktivitas Kucing - Nama: " + kucing.getNama() + " Energi: " + kucing.getEnergi());
        kucing.bersuara();
        kucing.bergerak();
        kucing.makan();
        kucing.bergerak();
        System.out.println();

        System.out.println("Aktivitas Ikan - Nama: " + ikan.getNama() + " Energi: " + ikan.getEnergi());
        ikan.bergerak();
        ikan.berenang();
        ikan.makan();
        ikan.berenang();
        System.out.println();

        System.out.println("Aktivitas Anjing - Nama: " + anjing.getNama() + " Energi: " + anjing.getEnergi());
        anjing.bersuara();
        anjing.bergerak();
        anjing.berenang();
        anjing.makan();
        anjing.bersuara();
        System.out.println();

        System.out.println("Aktivitas Burung - Nama: " + burung.getNama() + " Energi: " + burung.getEnergi());
        burung.bersuara();
        burung.bergerak();
        burung.makan();
        burung.bergerak();
        System.out.println();
    }
}
