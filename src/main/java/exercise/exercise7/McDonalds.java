package exercise.exercise7;

public class McDonalds extends Restaurant{
    private final String location;
    private final boolean hasPlayPlace;
    private final String[] menu;

    public McDonalds(String name, String location, boolean hasPlayPlace, String[] menu) {
        super(name);
        this.location = location;
        this.hasPlayPlace = hasPlayPlace;
        this.menu = menu;
    }

    @Override
    double totalPrice(double mealPrice) {
        double tax = 0.06;
        return mealPrice + (mealPrice*tax);
    }

    @Override
    String[] menuItems() {
        return menu;
    }

    @Override
    String location() {
        return location;
    }

    public boolean hasPlayPlace() {
        return hasPlayPlace;
    }
}
