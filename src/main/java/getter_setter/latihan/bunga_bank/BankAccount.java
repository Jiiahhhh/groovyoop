package getter_setter.latihan.bunga_bank;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate < 0 || interestRate > 10) {
            System.out.println("Interest Rate tidak boleh lebih dari 10% atau kurang dari 0%");
        } else {
            this.interestRate = interestRate;
        }
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        if (years > 0){
            this.years = years;
        } else {
            System.out.println("Apa ini? Belum lahir ko?");
        }

    }

    private double interestRate;
    private int years;

    public double calculateFutureBalance(){
        return balance * Math.pow(1+ interestRate/100, years);
    }
}
