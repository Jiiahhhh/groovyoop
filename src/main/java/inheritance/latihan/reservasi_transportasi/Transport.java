package inheritance.latihan.reservasi_transportasi;

abstract class Transport {
    String name;
    int capacity;

    public Transport(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    abstract double calculateFare (int passengers);
}
