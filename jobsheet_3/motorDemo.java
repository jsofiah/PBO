package jobsheet_3;

public class motorDemo {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";
        motor1.kecepatan = 50;
        motor1.displayStatus();
    }
}
