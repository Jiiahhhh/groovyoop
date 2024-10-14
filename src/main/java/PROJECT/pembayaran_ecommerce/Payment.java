package PROJECT.pembayaran_ecommerce;

import PROJECT.pembayaran_ecommerce.exception.InvalidPaymentAmountException;

abstract class Payment {
    private double amount;
    private String currency;

    public Payment(double amount, String currency) throws InvalidPaymentAmountException {
        if (amount < 0) {
            throw new InvalidPaymentAmountException("Jumlah pembayaran tidak boleh negatif.");
        }
        this.amount = amount;
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public abstract void processPayment();
}
