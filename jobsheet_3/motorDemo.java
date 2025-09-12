package jobsheet_3;

public class motorDemo {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";
        motor1.kecepatan = 50;
        motor1.displayStatus();

        motor motor2 = new motor();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinon = true;
        motor2.kecepatan = 40;
        motor2.displayStatus();

        motor motor3 = new motor();
        motor3.platNomor = "D 8343 CV";
        motor3.kecepatan = 60;
        motor3.displayStatus();
    }
}
