package PROJECT.pembayaran_ecommerce;

import PROJECT.pembayaran_ecommerce.exception.InvalidPaymentAmountException;

public class CreditCardPayment extends Payment implements Refundable{
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(double amount, String currency, String cardNumber, String cardHolder) throws InvalidPaymentAmountException {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment() {
        System.out.println("Pembayaran sebesar " + getAmount() + " " + getCurrency() + " dengan kartu kredit diproses.");
    }

    @Override
    public void refund(double amount) throws InvalidPaymentAmountException {
        if (amount > getAmount()){
            throw new InvalidPaymentAmountException("Jumlah refund melebihi jumlah pembayaran.");
        }
        System.out.println("Refund sebesar " + amount + " diproses ke kartu kredit.");
    }
}
