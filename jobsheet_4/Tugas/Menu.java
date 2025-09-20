package jobsheet_4.Tugas;

public class Menu {
    private String menuId;
    private String namaMenu;
    private double harga;

    public Menu(String menuId, String namaMenu, double harga) {
        this.menuId = menuId;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String infoMenu() {
        return menuId + " - " + namaMenu + " (Rp " + harga + ")";
    }
}

