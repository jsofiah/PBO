public class KendaraanDemo {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Sedan", 2022, 4, "Pertamax");
        System.out.println(mobil1.getInfo());

        Mobil mobil2 = new Mobil("Tesla", "Cybertruck", 2025, 2, "Listrik");
        System.out.println(mobil2.getInfo());
    }
}
