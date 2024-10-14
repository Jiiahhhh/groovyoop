package PROJECT.pembayaran_ecommerce;

import PROJECT.pembayaran_ecommerce.exception.InvalidPaymentAmountException;

public class EWalletPayment extends Payment implements Refundable {
    private String walletID;

    public EWalletPayment(double amount, String currency, String walletID) throws InvalidPaymentAmountException {
        super(amount, currency);
        this.walletID = walletID;
    }

    @Override
    public void processPayment() {
        System.out.println("Pembayaran sebesar " + getAmount() + " " + getCurrency() + " dengan e-wallet diproses");
    }

    @Override
    public void refund(double amount) throws InvalidPaymentAmountException {
        if (amount > getAmount()){
            throw new InvalidPaymentAmountException("Jumlah refund melebihi jumlah pembayaran.");
        } System.out.println("Refund sebesar " + amount + " diproses ke e-wallet.");
    }
}
