package onlineStore

class Clothing extends Product{
    String ukuran

    Clothing(String nama, double harga, int stok, String ukuran) {
        super(nama, harga, stok)
        this.ukuran = ukuran
    }

    @Override
    String tampilkanDetail() {
        return super.tampilkanDetail() + ", Stok: ${stok}"
    }
}
