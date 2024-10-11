package inheritance.belajar;

public class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void move(){
        System.out.println(brand + " bergerak dengan kecepatan " + speed);
    }
}
