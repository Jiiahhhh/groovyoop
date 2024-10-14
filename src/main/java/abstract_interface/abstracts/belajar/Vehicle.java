package abstract_interface.abstracts.belajar;

abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " started.");
    }

    abstract void drive();
}
