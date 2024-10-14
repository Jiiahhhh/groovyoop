package abstract_interface.latihan.sistem_transportasi;

public class Car extends Vehicle implements Refuelable, Maintainable{

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    void start() {
        System.out.println("Mobil " + name + " mulai berjalan dengan kecepatan " + speed + "km/jam." );
    }

    @Override
    void stop() {
        System.out.println("Mobil " + name + " berhenti.");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Mobil " + name + " menjalani perawatan.");
    }

    @Override
    public void refuel() {
        System.out.println("mobil " + name + " diisi bahan bakar.");
    }
}
