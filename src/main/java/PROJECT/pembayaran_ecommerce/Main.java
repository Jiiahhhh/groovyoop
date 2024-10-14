package PROJECT.pembayaran_ecommerce;

import PROJECT.pembayaran_ecommerce.exception.InvalidPaymentAmountException;
import PROJECT.pembayaran_ecommerce.exception.RefundNotSupportedException;

public class Main {
    public static void main(String[] args) {
        try {
            PaymentProcessor processor = new PaymentProcessor();

            CreditCardPayment creditCardPayment = new CreditCardPayment(50000, "IDR", "1234-5678-9876-5432", "John Doe");
            EWalletPayment eWalletPayment = new EWalletPayment(20000, "IDR", "ewallet123");
            BankTransferPayment bankTransferPayment = new BankTransferPayment(1000000, "IDR", "9876543210");

            processor.addPayment(creditCardPayment);
            processor.addPayment(eWalletPayment);
            processor.addPayment(bankTransferPayment);

            processor.processAllPayments();

            processor.refundPayment(creditCardPayment, 200000);
            processor.refundPayment(bankTransferPayment, 500000);
        } catch (InvalidPaymentAmountException | RefundNotSupportedException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
