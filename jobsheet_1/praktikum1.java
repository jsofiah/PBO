package jobsheet_1;

public class praktikum1 {
    public static void main(String[] args) {
        String judul1, judul2, judul3, judul4, judul5, judul6, judul7, judul8, judul9, judul10, penerbit1, penerbit2, penerbit3, penerbit4, penerbit5, penerbit6, penerbit7, penerbit8, penerbit9, penerbit10;
        int hal1, hal2, hal3, hal4, hal5, hal6, hal7, hal8, hal9, hal10, thn1, thn2, thn3, thn4, thn5, thn6, thn7, thn8, thn9, thn10;

        judul1 = "Harry Potter";
        penerbit1 = "Gramedia";
        hal1 = 392;
        thn1 = 2000;

        judul2 = "Game of Thrones";
        penerbit2 = "Mizan";
        hal2 = 968;
        thn2 = 2015;

        judul3 = "Laskar Pelangi";
        penerbit3 = "Bentang Pustaka";
        hal3 = 529;
        thn3 = 2005;

        judul4 = "The Hobbit";
        penerbit4 = "HarperCollins";
        hal4 = 310;
        thn4 = 1937;

        judul5 = "Sherlock Holmes";
        penerbit5 = "Gramedia";
        hal5 = 221;
        thn5 = 1892;

        judul6 = "To Kill a Mockingbird";
        penerbit6 = "Harper Lee Publishing";
        hal6 = 336;
        thn6 = 1960;

        judul7 = "1984";
        penerbit7 = "Penguin";
        hal7 = 328;
        thn7 = 1949;

        judul8 = "The Alchemist";
        penerbit8 = "Gramedia";
        hal8 = 208;
        thn8 = 1988;

        judul9 = "Dilan 1990";
        penerbit9 = "Pastel Books";
        hal9 = 330;
        thn9 = 2014;

        judul10 = "Percy Jackson";
        penerbit10 = "Hyperion";
        hal10 = 377;
        thn10 = 2005;

        System.out.println("\nSebelum Diubah");
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul1);
        System.out.println("Penerbit: " + penerbit1);
        System.out.println("Tahun Rilis: " + thn1);
        System.out.println("Jumlah Halaman: " + hal1);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul2);
        System.out.println("Penerbit: " + penerbit2);
        System.out.println("Tahun Rilis: " + thn2);
        System.out.println("Jumlah Halaman: " + hal2);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul3);
        System.out.println("Penerbit: " + penerbit3);
        System.out.println("Tahun Rilis: " + thn3);
        System.out.println("Jumlah Halaman: " + hal3);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul4);
        System.out.println("Penerbit: " + penerbit4);
        System.out.println("Tahun Rilis: " + thn4);
        System.out.println("Jumlah Halaman: " + hal4);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul5);
        System.out.println("Penerbit: " + penerbit5);
        System.out.println("Tahun Rilis: " + thn5);
        System.out.println("Jumlah Halaman: " + hal5);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul6);
        System.out.println("Penerbit: " + penerbit6);
        System.out.println("Tahun Rilis: " + thn6);
        System.out.println("Jumlah Halaman: " + hal6);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul7);
        System.out.println("Penerbit: " + penerbit7);
        System.out.println("Tahun Rilis: " + thn7);
        System.out.println("Jumlah Halaman: " + hal7);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul8);
        System.out.println("Penerbit: " + penerbit8);
        System.out.println("Tahun Rilis: " + thn8);
        System.out.println("Jumlah Halaman: " + hal8);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul9);
        System.out.println("Penerbit: " + penerbit9);
        System.out.println("Tahun Rilis: " + thn9);
        System.out.println("Jumlah Halaman: " + hal9);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul10);
        System.out.println("Penerbit: " + penerbit10);
        System.out.println("Tahun Rilis: " + thn10);
        System.out.println("Jumlah Halaman: " + hal10);
        System.out.println("---------------------------------------");

        thn1 = ubahTahun(thn1, 2001);
        thn2 = ubahTahun(thn2, 2016);
        thn3 = ubahTahun(thn3, 2006);
        thn4 = ubahTahun(thn4, 1934);
        thn5 = ubahTahun(thn5, 1893);
        thn6 = ubahTahun(thn6, 1961);
        thn7 = ubahTahun(thn7, 1950);
        thn8 = ubahTahun(thn8, 1989);
        thn9 = ubahTahun(thn9, 2015);
        thn10 = ubahTahun(thn10, 2006);

        hal1 = ubahHalaman(hal1, 395);
        hal2 = ubahHalaman(hal2, 960);
        hal3 = ubahHalaman(hal3, 530);
        hal4 = ubahHalaman(hal4, 320);
        hal5 = ubahHalaman(hal5, 222);
        hal6 = ubahHalaman(hal6, 338);
        hal7 = ubahHalaman(hal7, 329);
        hal8 = ubahHalaman(hal8, 210);
        hal9 = ubahHalaman(hal9, 335);
        hal10 = ubahHalaman(hal10, 376);

        System.out.println("\nSetelah Diubah");
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul1);
        System.out.println("Penerbit: " + penerbit1);
        System.out.println("Tahun Rilis: " + thn1);
        System.out.println("Jumlah Halaman: " + hal1);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul2);
        System.out.println("Penerbit: " + penerbit2);
        System.out.println("Tahun Rilis: " + thn2);
        System.out.println("Jumlah Halaman: " + hal2);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul3);
        System.out.println("Penerbit: " + penerbit3);
        System.out.println("Tahun Rilis: " + thn3);
        System.out.println("Jumlah Halaman: " + hal3);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul4);
        System.out.println("Penerbit: " + penerbit4);
        System.out.println("Tahun Rilis: " + thn4);
        System.out.println("Jumlah Halaman: " + hal4);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul5);
        System.out.println("Penerbit: " + penerbit5);
        System.out.println("Tahun Rilis: " + thn5);
        System.out.println("Jumlah Halaman: " + hal5);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul6);
        System.out.println("Penerbit: " + penerbit6);
        System.out.println("Tahun Rilis: " + thn6);
        System.out.println("Jumlah Halaman: " + hal6);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul7);
        System.out.println("Penerbit: " + penerbit7);
        System.out.println("Tahun Rilis: " + thn7);
        System.out.println("Jumlah Halaman: " + hal7);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul8);
        System.out.println("Penerbit: " + penerbit8);
        System.out.println("Tahun Rilis: " + thn8);
        System.out.println("Jumlah Halaman: " + hal8);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul9);
        System.out.println("Penerbit: " + penerbit9);
        System.out.println("Tahun Rilis: " + thn9);
        System.out.println("Jumlah Halaman: " + hal9);
        System.out.println("---------------------------------------");
        System.out.println("Judul Buku: " + judul10);
        System.out.println("Penerbit: " + penerbit10);
        System.out.println("Tahun Rilis: " + thn10);
        System.out.println("Jumlah Halaman: " + hal10);
        System.out.println("---------------------------------------");

    }

    public static int ubahTahun(int tahun, int thnBaru){
        tahun = thnBaru;
        return tahun;
    }

    public static int ubahHalaman(int halaman, int halBaru){
        halaman = halBaru;
        return halaman;
    }
}
