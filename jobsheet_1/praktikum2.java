package jobsheet_1;

import java.util.Scanner;

public class praktikum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka1, angka2, operator;
        double hasil = 0;

        System.out.println("            Kalkulator");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan Angka Pertama: ");
        angka1 = sc.nextInt();
        System.out.print("Masukkan Angka Kedua: ");
        angka2 = sc.nextInt();
        System.out.println("---------------------------------------");
        System.out.println("            Operator");
        System.out.println("---------------------------------------");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.print("Pilih Nomor Operator: ");
        operator = sc.nextInt();
        System.out.println("---------------------------------------");
        if(operator == 1){
            hasil = Tambah(hasil, angka1, angka2);
        } else if(operator == 2){
            hasil = Kurang(hasil, angka1, angka2);
        } else if(operator == 3){
            hasil = Kali(hasil, angka1, angka2);
        } else if(operator == 4){
            hasil = Bagi(hasil, angka1, angka2);
        } else{
            System.out.println("Tidak Valid");
        }
        System.out.print("Hasil: " + hasil);
    }

    public static double Tambah(double hasil, int angka1, int angka2){
        hasil = angka1 + angka2;
        return hasil;
    }
    public static double Kurang(double hasil, int angka1, int angka2){
        hasil = angka1 - angka2;
        return hasil;
    }
    public static double Kali(double hasil, int angka1, int angka2){
        hasil = angka1 * angka2;
        return hasil;
    }
    public static double Bagi(double hasil, int angka1, int angka2){
        hasil = angka1 / angka2;
        return hasil;
    }
}
