package keranjangBelanja

def keranjang = new KeranjangBelanja()

def elektronik = new Elektronik("Laptop", 10000000, 2)
def pakaian = new Pakaian("Erigo", 100000, "L")

keranjang.tambahBarang(elektronik)
keranjang.tambahBarang(pakaian)

keranjang.tampilkanBarang()
println("\n Total harga: ${keranjang.hitungTotalHarga()}")