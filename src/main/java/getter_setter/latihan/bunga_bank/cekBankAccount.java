package getter_setter.latihan.bunga_bank;

public class cekBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000000);

        bankAccount.setAccountNumber("12345");
        System.out.println("Nomor Rekening: " + bankAccount.getAccountNumber());

        System.out.println("Saldo Saat Ini: " + bankAccount.getBalance());

        bankAccount.setInterestRate(5);
        System.out.println("Suku Bunga: " + bankAccount.getInterestRate() + "%");

        bankAccount.setYears(3);
        System.out.println("Jumlah Tahun: " + bankAccount.getYears());

        System.out.printf("Saldo setelah %d Tahun: %.2f", bankAccount.getYears(), bankAccount.calculateFutureBalance());
    }
}
