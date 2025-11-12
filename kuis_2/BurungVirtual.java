public class BurungVirtual extends HewanPeliharaan implements IAudible {
    public BurungVirtual(String nama, int energi) {
        super(nama, energi);
    }

    public void bergerak(){
        if(getEnergi() >= 3){
            setEnergi(getEnergi() - 3);
            System.out.println(getNama() + " bergerak dengan terbang dari ranting ke ranting. Energi tersisa " + getEnergi());
        } else {
            System.out.println(getNama() + " terlalu lelah untuk bergerak.");
        }
    }

    public void bersuara(){
        System.out.println(getNama() + " mengeluarkan suara Cuit Cuit.");
    }
}
