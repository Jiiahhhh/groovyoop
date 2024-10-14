package PROJECT.discount_ecommerce;

public class RegularCustomer extends Customer implements Payabale{
    private static final double DISCOUNT_RATE = 0.10;

    public RegularCustomer(String name, String email) {
        super(name, email);
    }

    @Override
    double calculateDiscount(double totalAmount) {
        return totalAmount * DISCOUNT_RATE;
    }

    @Override
    public double pay(double totalAmount) throws InvalidDiscountException {
        double discount = calculateDiscount(totalAmount);
        if (discount > TransactionManager.MAX_DISCOUNT){
            throw new InvalidDiscountException("Diskon melebihi batas maksimal.");
        }
        return totalAmount - discount;
    }
}
