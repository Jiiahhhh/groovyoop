package abstract_interface.abstracts

abstract class Vehicle {
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    void start(){
        println("${brand} started.")
    }

    abstract void drive();
}
