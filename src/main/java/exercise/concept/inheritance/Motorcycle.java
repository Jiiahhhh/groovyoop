package exercise.concept.inheritance;

public class Motorcycle extends Vehicle {

    public Motorcycle(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + " "+ model + " "+ year + " much fast than Marquez!");
    }
}
