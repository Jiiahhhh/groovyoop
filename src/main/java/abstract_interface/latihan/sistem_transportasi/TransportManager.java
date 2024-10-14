package abstract_interface.latihan.sistem_transportasi;

public class TransportManager {
    public void testDrive(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }

    public void performVehicleService(Vehicle vehicle) {
        if (vehicle instanceof Maintainable) {
            if (vehicle instanceof Refuelable) {
                Refuelable refuelable = (Refuelable) vehicle;
                refuelable.refuel();
            }
            Maintainable maintainable = (Maintainable) vehicle;
            maintainable.performMaintenance();
        }
    }
}
