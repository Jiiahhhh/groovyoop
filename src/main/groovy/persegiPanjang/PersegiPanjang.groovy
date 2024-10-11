package persegiPanjang

class PersegiPanjang {
    double panjang
    double lebar

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang
        this.lebar = lebar
    }

    double hitungLuas() {
        return panjang * lebar
    }

    double hitungKeliling() {
        return 2 * (panjang + lebar)
    }

    void tampilkanHasil() {
        println("Panjang: ${panjang}")
        println("Lebar: ${lebar}")
        println("Luas: ${hitungLuas()}")
        println("Keliling: ${hitungKeliling()}")
    }
}
