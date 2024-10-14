package PROJECT.discount_ecommerce;

import java.util.List;

public class TransactionManager {
    public static final double MAX_DISCOUNT = 500000;

    public static double calculateTotalTransactions(List<Transaction> transactions) {
        double total = 0;
        for (Transaction transaction : transactions) {
            total += transaction.getTotalAmount();
        }
        return total;
    }
}
