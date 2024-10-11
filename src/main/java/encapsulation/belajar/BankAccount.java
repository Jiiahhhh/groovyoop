package encapsulation.belajar;

public class BankAccount {
    private double balance;

    public BankAccount (double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful");
        } else {
            System.out.println("Deposit failed");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Withdraw failed");
        }
    }
}
