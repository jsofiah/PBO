package kuis_1;

public class ReservasiDemo {
    public static void main(String[] args) {
        Ruangan r1 = new Ruangan("R01", "LSI 3", 30, "Terpakai");
        Ruangan r2 = new Ruangan("R02", "LIG 1", 25, "Tersedia");

        Reservasi rsv1 = new Reservasi("2025-06-26", 4, r1);

        Mahasiswa m1 = new Mahasiswa("244107060065", "Sofiah");
        Mahasiswa m2 = new Mahasiswa("244107777999", "Martin");
        Mahasiswa m3 = new Mahasiswa("244189898966", "James");

        rsv1.tambahMahasiswa(m1);
        rsv1.tambahMahasiswa(m2);
        rsv1.tambahMahasiswa(m3);

        rsv1.tampilReservasi();
    }
}
