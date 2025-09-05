public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "244107060065";
        m2.nama = "Sofiah";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2D";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Budi Bubadibako";
        m3.alamat = "Jiran, Malaysia";
        m3.kelas = "2B";

        m1.displayBiodata();
        System.out.println();
        m2.displayBiodata();
        System.out.println();
        m3.displayBiodata();
    }
}