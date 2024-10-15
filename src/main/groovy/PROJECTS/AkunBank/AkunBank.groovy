package PROJECTS.AkunBank

class AkunBank {
    String nomorRekening
    double saldo

    AkunBank (String nomorRekening, double saldo){
        this.nomorRekening = nomorRekening
        this.saldo = saldo
    }

    void deposit(double jumlah){
        saldo = saldo+jumlah
        println("Saldo bertambah : Rp${jumlah}")
    }

    void tarik(double jumlah) {
        if (saldo<jumlah){
            println("Minggir lu miskin!")
        } else {
            saldo=saldo-jumlah
            println("Anda menarik : Rp${jumlah}")
        }
    }

    void tampilkanSaldo() {
        println("Nomor Rekening: ${nomorRekening}")
        println("Saldo: Rp${saldo}")
    }
}
