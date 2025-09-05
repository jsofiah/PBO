package tugas;

public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public void displayInfo(){
        System.out.println("  Data Persegi Panjang");
        System.out.println("========================");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Luas    : " + getLuasPersegi());
        System.out.println("Keliling: " + getKelilingPersegi());
    }

    public int getLuasPersegi(){
        return panjang * lebar;
    }

    public int getKelilingPersegi(){
        return 2 * (panjang + lebar);
    }
}
