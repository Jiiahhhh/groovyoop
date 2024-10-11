package keranjangBelanja

class KeranjangBelanja {
    List<Barang> daftarBarang = []

    void tambahBarang(Barang barang) {
        daftarBarang.add(barang)
    }

    void tampilkanBarang() {
        println("Barang di keranjang:")
        daftarBarang.each {it.tampilkanInfo()}
    }

    double hitungTotalHarga () {
        return daftarBarang.sum{it.harga}
    }
}
