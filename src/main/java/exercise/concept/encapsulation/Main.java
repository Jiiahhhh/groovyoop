package exercise.concept.encapsulation;

import exercise.concept.encapsulation.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(12345678);
        bankAccount.setBalance(1000000.0);
        bankAccount.setAccountHolderName("Tanto");
        System.out.println("Saldo di Rekening " + bankAccount.getAccountNumber() + " milik " + bankAccount.getAccountHolderName() + " tersisa : Rp" + bankAccount.getBalance());

        bankAccount.deposit(500000);
        System.out.println("Setelah Depo, saldo di Rekening " + bankAccount.getAccountNumber() + " milik " + bankAccount.getAccountHolderName() + " tersisa: Rp" + bankAccount.getBalance());

        bankAccount.withdraw(50000);
        System.out.println("Setelah Narik, saldo di Rekening " + bankAccount.getAccountNumber() + " milik " + bankAccount.getAccountHolderName() + " tersisa: Rp" + bankAccount.getBalance());
    }
}
