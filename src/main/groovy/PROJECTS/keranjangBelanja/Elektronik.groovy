package PROJECTS.keranjangBelanja

class Elektronik extends Barang{
    int garansi

    Elektronik(String nama, double harga, int garansi) {
        super(nama, harga)
        this.garansi = garansi
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo()
        println("Garansi: ${garansi} tahun")
    }
}
