package PROJECTS.Pembayaran

class KartuKredit implements Pembayaran{
    String nomorKartu
    double limitKredit

    KartuKredit(String nomorKartu, double limitKredit){
        this.nomorKartu = nomorKartu
        this.limitKredit = limitKredit
    }

    @Override
    def bayar(double jumlah) {
        if (limitKredit <= jumlah) {
            println("Minggir lu miskin!")
        } else {
            limitKredit = limitKredit - jumlah
            println("Limit Kredit Anda tersisa: ${limitKredit}")
        }
    }
}
