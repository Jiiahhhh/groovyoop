package inheritance.latihan.sistem_kendaraan;

public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Motor " + brand + " bergerak dengan kecepatan " + speed + "km/jam.");
    }
}
