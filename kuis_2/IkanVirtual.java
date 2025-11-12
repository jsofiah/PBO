public class IkanVirtual extends HewanPeliharaan implements ISwimmable{

    public IkanVirtual(String nama, int energi) {
        super(nama, energi);
    }
    
    public void bergerak(){
        if(getEnergi() >= 3){
            setEnergi(getEnergi() - 3);
            System.out.println(getNama() + " bergerak ke sana kemari dengan mengibaskan ekor. Energi tersisa " + getEnergi());
        } else {
            System.out.println(getNama() + " terlalu lelah untuk bergerak.");
        }
    }

    public void berenang() {
        if (getEnergi() >= 7) {
            setEnergi(getEnergi() - 7);
            System.out.println(getNama() + " berenang dengan cepat di akuariu. Energi tersisa " + getEnergi());
        } else {
            System.out.println(getNama() + " terlalu lelah untuk berenang cepat!");
        }
    }
}