package tugas;

public class BukuDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.idBuku = 101;
        buku1.judul = "Pemrograman Dasar Java";
        buku1.penulis = "Andi Wijaya";
        buku1.tahunTerbit = 2021;
        buku1.jumlahHalaman = 250;
        buku1.sinopsis = "Buku ini membahas pemrograman Java mulai dari variabel, tipe data, hingga PBO.";

        Buku buku2 = new Buku();
        buku2.idBuku = 102;
        buku2.judul = "Basis Data Lanjut";
        buku2.penulis = "Budi Santoso";
        buku2.tahunTerbit = 2020;
        buku2.jumlahHalaman = 300;
        buku2.sinopsis = "Buku ini membahas konsep basis data tingkat lanjut, normalisasi, dan query SQL kompleks.";

        System.out.println("\n========= Data Awal Buku =========");
        buku1.tampilInfoBuku();
        buku1.tampilSinopsis();
        buku2.tampilInfoBuku();
        buku2.tampilSinopsis();

        buku1.judul = "Pemrograman Java PBO";
        buku2.judul = "Basis Data Modern";

        buku1.tahunTerbit = 2022;
        buku2.jumlahHalaman = 350;

        buku1.sinopsis = "Buku ini membahas PBO di Java, termasuk inheritance, polymorphism, dan encapsulation.";
        buku2.sinopsis = "Buku ini membahas basis data modern, termasuk Big Data dan NoSQL.";

        System.out.println("\n========= Data Buku Setelah Update =========");
        buku1.tampilInfoBuku();
        buku1.tampilSinopsis();
        buku2.tampilInfoBuku();
        buku2.tampilSinopsis();
    }
}
