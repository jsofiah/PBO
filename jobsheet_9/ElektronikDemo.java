public class ElektronikDemo {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Angin Meja", 300000, "Biru", "Cosmos");
        TV tv = new TV("LED", 7, 4000000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 2800000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(5, 3, 8000000, "Silver", "Panasonic");

        System.out.println(kipas.getInfo());
        System.out.println();
        System.out.println(tv.getInfo());
        System.out.println();
        System.out.println(kulkas.getInfo());
        System.out.println();
        System.out.println(smartFridge.getInfo());
    }

}
