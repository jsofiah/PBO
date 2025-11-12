public class AnjingVirtual extends HewanPeliharaan implements IAudible, ISwimmable{
    public AnjingVirtual(String nama, int energi) {
        super(nama, energi);
    }

    public void bergerak() {
        if (getEnergi() >= 5) {
            setEnergi(getEnergi() - 5);
            System.out.println(getNama() + " berlari dengan ceria. Energi tersisa " + getEnergi());
        } else {
            System.out.println(getNama() + " terlalu lelah untuk berlari.");
        }
    }

    public void bersuara(){
        System.out.println(getNama() + " mengeluarkan suara Guk Guk.");
    }

    public void berenang() {
        if (getEnergi() >= 8) {
            setEnergi(getEnergi() - 8);
            System.out.println(getNama() + " berenang di kolam. Energi tersisa " + getEnergi());
        } else {
            System.out.println(getNama() + " terlalu lelah untuk berenang.");
        }
    }

}
