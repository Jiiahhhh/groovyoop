package PROJECTS.Transportasi

class Kendaraan {
    String nama
    double kecepatan

    Kendaraan(String nama, double kecepatan) {
        this.nama = nama
        this.kecepatan = kecepatan
    }

    void tampilkanInfo() {
        println("Nama: ${nama}")
        println("Kecepatan: ${kecepatan}")
    }
}
