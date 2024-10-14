package PROJECT.discount_ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        Customer regularCustomer = new RegularCustomer("John Doe", "john@example.com");
        Customer premiumCustomer = new PremiumCustomer("Jane Smith", "jane@example.com");

        Transaction transaction1 = new Transaction(regularCustomer, 500000);
        Transaction transaction2 = new Transaction(premiumCustomer, 1000000);

        transaction1.processPayment();
        transaction2.processPayment();

        transactions.add(transaction1);
        transactions.add(transaction2);

        double total = TransactionManager.calculateTotalTransactions(transactions);
        System.out.println("Total semua transaksi yang diproses: " + total);
    }
}
