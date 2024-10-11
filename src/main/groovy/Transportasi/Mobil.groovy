package Transportasi

class Mobil extends Kendaraan {
    int jumlahPintu

    Mobil(String nama, double kecepatan, int jumlahPintu) {
        super(nama, kecepatan)
        this.jumlahPintu = jumlahPintu
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo()
        println("Jumlah Pintu: ${jumlahPintu}")
    }
}
