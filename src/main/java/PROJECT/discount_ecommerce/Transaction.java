package PROJECT.discount_ecommerce;

public class Transaction {
    Customer customer;
    double totalAmount;

    public Transaction(Customer customer, double totalAmount) {
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    public void processPayment() {
        try {
            Payabale payableCustomer = (Payabale) customer;
            double finalAmount = payableCustomer.pay(totalAmount);
            System.out.println("Pelanggan: " + customer.getName());
            System.out.println("Total yang harus dibayar: " + finalAmount);
        } catch (InvalidDiscountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
