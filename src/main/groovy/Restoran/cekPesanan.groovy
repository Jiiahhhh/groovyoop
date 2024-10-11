package Restoran

def pesanan = new Pesanan("Ilal", 2)
pesanan.tambahMenu("Nasi goreng")
pesanan.tambahMenu("Air mineral")
pesanan.tampilkanPesanan()
pesanan.hapusMenu("Air mineral")
pesanan.tambahMenu("Es Teh")
pesanan.tampilkanPesanan()