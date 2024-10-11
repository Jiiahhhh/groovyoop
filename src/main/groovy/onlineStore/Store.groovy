package onlineStore

class Store {
    Map <String, Product> daftarProduk = [:]

    void tambahProduk(String kode, Product product){
        daftarProduk[kode] = product
    }

    void tampilkanProduk(){
        daftarProduk.each {kode, product ->
            println("Kode: ${kode}, "  + product.tampilkanDetail())
        }
    }

    void beliProduk(String kode, int jumlah) {
        if (daftarProduk.containsKey(kode)) {
            def produk = daftarProduk[kode]
            if (produk.stok >= jumlah) {
                produk.stok -= jumlah
                println("Memesan ${jumlah} ${produk.nama}...")
                println("Pembelian berhasil. Sisa stok ${produk.nama}: ${produk.stok}")
            } else {
                println("Stok tidak mencukupi")
            }
        } else {
            println("Produk tidak terdaftar")
        }
    }
}
