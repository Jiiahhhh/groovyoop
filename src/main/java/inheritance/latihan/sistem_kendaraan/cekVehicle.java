package inheritance.latihan.sistem_kendaraan;

public class cekVehicle {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 100, 4);
        car.move();
        Motorcycle motorcycle = new Motorcycle("Yamaha", 80, true);
        motorcycle.move();
    }
}
