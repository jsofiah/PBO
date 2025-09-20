package jobsheet_4.Tugas;
import java.util.ArrayList;

public class Customer {
    private String customerId;
    private String nama;
    private String noTelepon;
    private ArrayList<Order> historyOrder;

    public Customer(String customerId, String nama, String noTelepon) {
        this.customerId = customerId;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.historyOrder = new ArrayList<Order>();
    }

    public String getCustomerId(){
        return customerId;
    }

    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNoTelepon(){
        return noTelepon;
    }

    public void setNoTelepon (String noTelepon){
        this.noTelepon = noTelepon;
    }

    public ArrayList<Order> getHistoryOrder() {
        return historyOrder;
    }

    public void tambahOrder(Order order) {
        historyOrder.add(order);
    }

    public String infoCustomer() {
        return customerId + " - " + nama + " (Telp: " + noTelepon + ")";
    }

    public String tampilHistoryOrder() {
        String history = "";
        history += "Customer : " + nama + " (" + customerId + ")\n";
        history += "No Telp  : " + noTelepon + "\n";

        if (!historyOrder.isEmpty()) {
            history += "Riwayat Order:\n";
            for (Order order : historyOrder) {
                history += order.tampilOrder() + "\n";
            }
        } else {
            history += "Belum ada order\n";
        }

        return history;
    }
    
}
