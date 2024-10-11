package onlineStore

class Electronic extends Product{
    int garansi

    Electronic(String nama, double harga, int stok, int garansi) {
        super(nama, harga, stok)
        this.garansi = garansi
    }

    @Override
    String tampilkanDetail() {
        return super.tampilkanDetail() + ", Garansi: ${garansi} tahun"
    }
}
