package exercise.exercise7;

import java.util.ArrayList;

abstract class Restaurant {
    String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void nameRestaurant(){
        System.out.println("Restaurant " + name);
    }

    abstract double totalPrice(double mealPrice);
    abstract String[] menuItems();
    abstract String location();
}
