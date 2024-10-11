package inheritance.latihan.reservasi_transportasi;

public class Airplane extends Transport {
    double ticketPrice;
    String classType;

    public Airplane(String name, int capacity, double ticketPrice, String classType) {
        super(name, capacity);
        this.ticketPrice = ticketPrice;
        this.classType = classType;
    }

    @Override
    public double calculateFare(int passengers) {
        double totalFare = passengers * ticketPrice;

        if (classType.equalsIgnoreCase("Business")){
            totalFare *= 1.5;
        } else if (classType.equalsIgnoreCase("First Class")){
            totalFare *= 2;
        }
        return totalFare;
    }
}
