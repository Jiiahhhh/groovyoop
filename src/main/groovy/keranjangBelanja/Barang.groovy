package keranjangBelanja

class Barang {
    String nama
    double harga

    Barang(String nama, double harga) {
        this.nama = nama
        this.harga = harga
    }

    void tampilkanInfo(){
        println("Nama: ${nama}")
        println("Harga: ${harga}")
    }
}
