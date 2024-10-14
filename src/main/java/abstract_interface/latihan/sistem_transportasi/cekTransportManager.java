package abstract_interface.latihan.sistem_transportasi;

public class cekTransportManager {
    public static void main(String[] args) {
        Vehicle car = new Car("Tesla", 100);
        Vehicle electricCar = new ElectricCar("Nissan Leaf", 120);
        Vehicle bicycle = new Bicycle("Polygon", 20);

        TransportManager transportManager = new TransportManager();
        transportManager.testDrive(car);
        transportManager.performVehicleService(car);
        System.out.println();
        transportManager.testDrive(electricCar);
        transportManager.performVehicleService(electricCar);
        System.out.println();
        transportManager.testDrive(bicycle);
        transportManager.performVehicleService(bicycle);
    }
}
