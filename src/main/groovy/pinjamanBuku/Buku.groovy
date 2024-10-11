package pinjamanBuku

class Buku {
    String judul
    String penulis
    int tahunTerbit

    Buku(String judul, String penulis, int tahunTerbit){
        this.judul = judul
        this.penulis = penulis
        this.tahunTerbit = tahunTerbit
    }

    void tampilkanInfo() {
        println("Judul : ${judul}, Penulis: ${penulis}, Tahun: ${tahunTerbit}")
    }
}
