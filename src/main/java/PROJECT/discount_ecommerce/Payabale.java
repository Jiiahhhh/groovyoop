package PROJECT.discount_ecommerce;

public interface Payabale {
    double pay (double totalAmount) throws InvalidDiscountException;
}
