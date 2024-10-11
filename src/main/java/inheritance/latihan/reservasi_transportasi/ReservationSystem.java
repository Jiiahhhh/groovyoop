package inheritance.latihan.reservasi_transportasi;

public class ReservationSystem {
    public void makeReservation(Transport transport, int passengers){
        System.out.println("Transportasi: " + transport.name);
        System.out.println("Jumlah Penumpang: " + passengers);
        System.out.println("Total Harga Tiket: " + transport.calculateFare(passengers));
    }
}
