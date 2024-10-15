package abstract_interface.abstracts

class Car extends Vehicle {
    Car(String brand) {
        super(brand)
    }

    @Override
    void drive() {
        println("${brand} is driving on the road")
    }
}
