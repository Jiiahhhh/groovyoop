package EXERCISE.concept.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mitsubishi", "Eterna", 2009);
        Motorcycle motorcycle = new Motorcycle("Vespa", "Scooter", 2012);

        car.startEngine();
        motorcycle.startEngine();
    }
}
