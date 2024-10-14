package abstract_interface.latihan.sistem_transportasi;

public class Bicycle extends Vehicle {
    public Bicycle(String name, int speed) {
        super(name, speed);
    }

    @Override
    void start() {
        System.out.println("Sepeda " + name + " mulai dikayuh dengan kecepatan " + speed + " km/jam.");
    }

    @Override
    void stop() {
        System.out.println("Sepeda " + name + " berhenti.");
    }
}
