package abstract_interface.latihan.sistem_transportasi;

public class ElectricCar extends Vehicle implements Maintainable{
    public ElectricCar(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void performMaintenance() {
        System.out.println("Mobil listrik " + name + " menjalani perawatan");
    }

    @Override
    void start() {
        System.out.println("Mobil listrik " + name + " mulai berjalan dengan kecepatan " + speed + " km/jam.");
    }

    @Override
    void stop() {
        System.out.println("Mobil listrik " + name + " berhenti.");
    }
}
