package composition.belajar;

public class Car {
    private Engine engine;
    private Wheel wheel;

    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    public void startCar(){
        engine.start();
        wheel.rotate();
        System.out.println("Mobil mulai berjalan");
    }
}
