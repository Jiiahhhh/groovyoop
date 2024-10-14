package PROJECT.pembayaran_ecommerce;

import PROJECT.pembayaran_ecommerce.exception.InvalidPaymentAmountException;
import PROJECT.pembayaran_ecommerce.exception.RefundNotSupportedException;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {
    private List<Payment> payments;

    public PaymentProcessor() {
        payments = new ArrayList<>();
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public void processAllPayments() {
        for (Payment payment : payments) {
            payment.processPayment();
        }
    }

    public void refundPayment(Payment payment, double amount) throws RefundNotSupportedException, InvalidPaymentAmountException {
        if (payment instanceof Refundable){
            ((Refundable) payment).refund(amount);
        } else {
            throw new RefundNotSupportedException("Metode pembayaran tidak mendukung refund.");
        }
    }
}
