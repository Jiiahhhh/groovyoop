package Transportasi

class Motor extends Kendaraan{
    String jenisMotor

    Motor(String nama, double kecepatan, String jenisMotor) {
        super(nama, kecepatan)
        this.jenisMotor = jenisMotor
    }

    @Override
    void tampilkanInfo() {
        super.tampilkanInfo()
        println("Jenis motor: ${jenisMotor}")
    }
}
