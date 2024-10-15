package PROJECTS.BukuPerpustakaan

class Buku {
    String judul
    String penulis
    String tahunTerbit

    Buku(String judul, String penulis, String tahunTerbit) {
        this.judul = judul
        this.penulis = penulis
        this.tahunTerbit = tahunTerbit
    }

    void tampilkanDetail() {
        println("Judul: ${judul}")
        println("Penulis: ${penulis}")
        println("Tahun Terbit: ${tahunTerbit}")
        println("${isBukuTua() ? 'Buku ini buku tua' : 'Buku ini buku baru'}")
    }

    boolean isBukuTua(){
        return Integer.parseInt(tahunTerbit) < 2000
    }
}
