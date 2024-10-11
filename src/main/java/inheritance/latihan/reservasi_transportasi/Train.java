package inheritance.latihan.reservasi_transportasi;

public class Train extends Transport {
    double ticketPrice;
    double distance;

    public Train(String name, int capacity, double ticketPrice, double distance) {
        super(name, capacity);
        this.ticketPrice = ticketPrice;
        this.distance = distance;
    }

    @Override
    public double calculateFare(int passengers) {
        double totalFare = passengers * ticketPrice;
        if (distance > 100) {
            totalFare *= 1.2;
        }
        return totalFare;
    }
}
