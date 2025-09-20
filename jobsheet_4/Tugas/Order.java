package jobsheet_4.Tugas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private String orderId;
    private LocalDate tanggal;
    private ArrayList<Menu> item;

    public Order(String orderId, LocalDate tanggal) {
        this.orderId = orderId;
        this.tanggal = tanggal;
        this.item = new ArrayList<Menu>();
    }

    public String getOrderId(){
        return orderId;
    }

    public void setOrderId(String orderId){
        this.orderId = orderId;
    }

    public LocalDate getTanggal(){
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal){
        this.tanggal = tanggal;
    }

    public void tambahMenu(Menu menu) {
        item.add(menu);
    }

    public double totalBayar() {
        double total = 0;
        for (Menu menu : item) {
            total += menu.getHarga();
        }
        return total;
    }

    public String tampilOrder() {
        String info = "";
        info += "\tOrder ID      : " + orderId + "\n";
        info += "\tTanggal Order : " + tanggal + "\n";
        info += "\tDaftar Menu   :\n";

        if (!item.isEmpty()) {
            for (Menu menu : item) {
                info += "\t\t" + menu.infoMenu() + "\n";
            }
        } else {
            info += "\t\tBelum ada menu\n";
        }

        info += "Total Bayar   : Rp " + totalBayar() + "\n";
        return info;
    }
}
