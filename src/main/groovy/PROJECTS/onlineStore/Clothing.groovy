package PROJECTS.onlineStore

class Clothing extends Product{
    String ukuran

    Clothing(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok)
        this.ukuran = ukuran
    }

    @Override
    String tampilkanDetail() {
        return Object.tampilkanDetail() + ", Stok: ${stok}"
    }
}
