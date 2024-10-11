package inheritance.belajar;

public class Car extends Vehicle {
    int numberDoors;

    Car(String brand, int speed, int numberDoors) {
        super(brand, speed);
        this.numberDoors = numberDoors;
    }

    void honk(){
        System.out.println("Mobil " + brand + " membunyikan klakson!");
    }

    @Override
    void move() {
        System.out.println("Car " + brand + " dengan " + numberDoors + " pintu, bergerak dengan kecepatan " + speed + " km/jam");
    }
}
