package abstract_interface.abstracts.belajar;

public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println(brand + " is driving on the road.");
    }
}
