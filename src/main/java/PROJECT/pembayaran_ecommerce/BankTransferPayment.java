package PROJECT.pembayaran_ecommerce;

import PROJECT.pembayaran_ecommerce.exception.InvalidPaymentAmountException;

public class BankTransferPayment extends Payment {
    private String bankAccountNumber;

    public BankTransferPayment(double amount, String currency, String bankAccountNumber) throws InvalidPaymentAmountException {
        super(amount, currency);
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Pembayaran sebesar " + getAmount() + " " + getCurrency() + " dengan transfer bank diproses.");
    }
}
