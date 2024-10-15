package PROJECTS.keranjangBelanja

class Pakaian extends Barang{
    String ukuran

    Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga)
        this.ukuran = ukuran
    }

    @Override
    void tampilkanInfo() {
        Object.tampilkanInfo()
        println("Ukuran: ${ukuran}")
    }
}
