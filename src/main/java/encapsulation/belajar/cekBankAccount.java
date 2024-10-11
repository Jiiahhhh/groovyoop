package encapsulation.belajar;

public class cekBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000000);
        account.deposit(1000000);
        account.withdraw(2000000);
        System.out.println("Current balance: Rp" + account.getBalance());
    }
}
