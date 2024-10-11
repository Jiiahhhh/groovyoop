package pinjamanBuku

def perpustakaan = new Perpustakaan()

def buku1 = new Buku("Java Programming", "John Doe", 2015)
def buku2 = new Buku("Groovy in Action", "Jane Smith", 2018)

perpustakaan.tambahBuku("B001", buku1)
perpustakaan.tambahBuku("B002", buku2)

perpustakaan.tampilkanDaftarBuku()

println "\nMeminjam buku dengan kode B001..."
perpustakaan.pinjamBuku("B001")

println "\nDaftar Buku di Perpustakaan setelah peminjaman:"
perpustakaan.tampilkanDaftarBuku()