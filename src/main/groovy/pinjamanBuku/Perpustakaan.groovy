package pinjamanBuku

class Perpustakaan {
    Map<String, Buku> daftarBuku = [:]

    // Method untuk menambahkan buku ke perpustakaan
    void tambahBuku(String kodeBuku, Buku buku) {
        daftarBuku[kodeBuku] = buku
    }

    // Method untuk meminjam buku
    void pinjamBuku(String kodeBuku) {
        if (daftarBuku.containsKey(kodeBuku)) {
            Buku buku = daftarBuku.remove(kodeBuku)
            println "Buku berhasil dipinjam: ${buku.judul}"
        } else {
            println "Buku dengan kode ${kodeBuku} tidak tersedia."
        }
    }

    // Method untuk menampilkan semua buku yang ada di perpustakaan
    void tampilkanDaftarBuku() {
        println "Daftar Buku di Perpustakaan:"
        daftarBuku.each { kode, buku ->
            println "Kode: ${kode}, "
            buku.tampilkanInfo()
        }
    }
}
