package PROJECTS.Transportasi

class Motor extends Kendaraan{
    String jenisMotor

    Motor(String nama, double kecepatan, String jenisMotor) {
        super(nama, kecepatan)
        this.jenisMotor = jenisMotor
    }

    @Override
    void tampilkanInfo() {
        Object.tampilkanInfo()
        println("Jenis motor: ${jenisMotor}")
    }
}
