package inheritance.latihan.reservasi_transportasi;

public class cekTransport {
    public static void main(String[] args) {
        ReservationSystem system = new ReservationSystem();

        Bus bus = new Bus("Bus", 40, 50000);
        system.makeReservation(bus, 15);
        System.out.println();

        Train train = new Train("Train", 100, 150000, 200);
        system.makeReservation(train, 20);
        System.out.println();

        Airplane airplane = new Airplane("Airplane", 50, 1000000, "Business");
        system.makeReservation(airplane, 10);
    }
}
