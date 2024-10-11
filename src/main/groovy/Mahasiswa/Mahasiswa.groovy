package Mahasiswa

class Mahasiswa {
    String nama
    String nim
    double nilai

    Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    void tampilkanInfo() {
        println("Nama: ${nama}")
        println("NIM: ${nim}")
        println("Nilai: ${nilai}")
        println("Status:  ${(isLulus() ? 'Lulus' : 'Tidak lulus')}")
    }

    boolean isLulus(){
        return nilai>= 60;
    }
}
