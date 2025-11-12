public class KucingVirtual extends HewanPeliharaan implements IAudible {

    public KucingVirtual(String nama, int energi) {
        super(nama, energi);
    }
    
    public void bergerak(){
        if(getEnergi() >= 6){
            setEnergi(getEnergi() - 6);
            System.out.println(getNama() + " berlari-lari dengan lincah sampai naik pohon. Energi tersisa " + getEnergi());
        } else {
            System.out.println(getNama() + " terlalu lelah untuk bergerak.");
        }
    }

    public void bersuara(){
        System.out.println(getNama() + " mengeluarkan suara Miaw Miaw  ");
    }
}