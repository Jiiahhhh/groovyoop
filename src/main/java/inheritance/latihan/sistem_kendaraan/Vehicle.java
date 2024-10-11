package inheritance.latihan.sistem_kendaraan;

public class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void move(){
        System.out.println("Kendaraan " + brand + " bergerak dengan kecepatan " + speed + " km/h");
    }
}
