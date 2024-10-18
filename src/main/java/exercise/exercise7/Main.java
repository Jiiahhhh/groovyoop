package exercise.exercise7;

public class Main {
    public static void main(String[] args) {
        String[] meals = {"Burger", "Fries", "Ice Cream"};
        McDonalds mcDonalds = new McDonalds("McD Perintis", "Makassar", true, meals);

        mcDonalds.nameRestaurant();
        System.out.println("Location: " + mcDonalds.location());

        double mealPrice = 10;
        System.out.println("Total Price with tax: " + mcDonalds.totalPrice(mealPrice));

        System.out.println("Has Play Place:" + mcDonalds.hasPlayPlace());

        System.out.println("Menu Items: ");
        for (String item: mcDonalds.menuItems()) {
            System.out.println("- " + item);
        }
    }
}
