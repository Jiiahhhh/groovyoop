package inheritance.latihan.sistem_kendaraan;

public class Car extends Vehicle {
    int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("Mobil " + brand + " bergerak dengan kecepatan " + speed + " km/h");
    }
}