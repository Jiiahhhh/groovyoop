package composition.belajar;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Wheel wheel = new Wheel(18);
        Car car = new Car(engine, wheel);

        car.startCar();
    }
}
