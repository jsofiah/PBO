package jobsheet_4.Tugas;
import java.time.LocalDate;

public class RestoranDemo {
    public static void main(String[] args) {
        Menu burger = new Menu("F01", "Burger", 35000);
        Menu pepsi = new Menu("D01", "Pepsi", 15000);
        Menu hotdog = new Menu("F02", "Hotdog",25000);

        Customer sofi = new Customer("19", "Sofi", "081334990991");
        Customer martin = new Customer("21", "Martin", "081230216068");

        Order o1 = new Order("O1", LocalDate.of(2025, 9, 19));
        o1.tambahMenu(burger);
        o1.tambahMenu(pepsi);

        Order o2 = new Order("O2", LocalDate.of(2025, 9, 20));
        o2.tambahMenu(hotdog);
        o2.tambahMenu(pepsi);

        sofi.tambahOrder(o1);
        sofi.tambahOrder(o2);
        
        System.out.println(sofi.tampilHistoryOrder());
        System.out.println(martin.tampilHistoryOrder());

    }
}
