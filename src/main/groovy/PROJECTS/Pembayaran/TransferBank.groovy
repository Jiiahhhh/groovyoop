package PROJECTS.Pembayaran

class TransferBank implements Pembayaran{
    String nomorRekening
    double saldo

    TransferBank(String nomorRekening, double saldo){
        this.nomorRekening = nomorRekening
        this.saldo = saldo
    }

    @Override
    def bayar(double jumlah) {
        if (saldo < jumlah) {
            println("Minggir lu miskin!")
        } else {
            saldo = saldo - jumlah
            println("Saldo Anda tersisa: ${saldo}")
        }
    }
}
