package PROJECT.pembayaran_ecommerce;

import PROJECT.pembayaran_ecommerce.exception.InvalidPaymentAmountException;

public interface Refundable {
    void refund(double amount) throws InvalidPaymentAmountException;
}
