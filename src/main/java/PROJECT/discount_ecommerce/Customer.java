package PROJECT.discount_ecommerce;

abstract class Customer {
    String name;
    String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    abstract double calculateDiscount(double totalAmount);
}
