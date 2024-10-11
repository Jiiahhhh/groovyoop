package inheritance.latihan.reservasi_transportasi;

public class Bus extends Transport{
    double ticketPrice;

    public Bus(String name, int capacity, double ticketPrice) {
        super(name, capacity);
        this.ticketPrice = ticketPrice;
    }

    @Override
    public double calculateFare(int passengers) {
        double totalFare = ticketPrice * passengers;
        if (passengers > 10) {
            totalFare *= 0.9;
        }
        return totalFare;
    }
}
