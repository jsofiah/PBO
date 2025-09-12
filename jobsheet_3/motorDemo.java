package jobsheet_3;

public class motorDemo {
    public static void main(String[] args) {
        motor motor1 = new motor();
        motor1.displayStatus();

        motor1.platNomor = "B 0838 XZ";
        int kecepatanBaru = 50;
        if(!motor1.isMesinon && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru;
        }
        // motor1.kecepatan = 50;
        motor1.displayStatus();

        motor motor2 = new motor();
        motor2.platNomor = "N 9840 AB";
        motor2.isMesinon = true;
        kecepatanBaru = 40;
        if(!motor2.isMesinon && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor2.kecepatan = kecepatanBaru;
        }
        // motor2.kecepatan = 40;
        motor2.displayStatus();

        motor motor3 = new motor();
        motor3.platNomor = "D 8343 CV";
        kecepatanBaru = 60;
        if(!motor1.isMesinon && kecepatanBaru > 0){
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.kecepatan = kecepatanBaru;
        }
        // motor3.kecepatan = 60;
        motor3.displayStatus();
    }
}
