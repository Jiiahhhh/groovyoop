package abstract_interface.latihan.sistem_transportasi;

abstract class Vehicle {
    String name;
    int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    abstract void start();
    abstract void stop();
}
