package exercise.concept.inheritance;

public class Car extends Vehicle {
    public Car(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " "+ model + " "+ year + " is running like a beast!");
    }
}
