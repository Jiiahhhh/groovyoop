package getter_setter.latihan.pesan_tiket_bioskop;

public class cekCinemaTicket {
    public static void main(String[] args) {
        CinemaTicket cinemaTicket = new CinemaTicket();

        cinemaTicket.setMovieTitle("Spider-Man");
        cinemaTicket.setTicketPrice(100000);
        cinemaTicket.setSeatsAvailable(30);
        cinemaTicket.setPremium(true);

        System.out.println("Film: " + cinemaTicket.getMovieTitle());
        System.out.println("Harga Tiket: " + cinemaTicket.getTicketPrice());
        System.out.println("Kursi Tersedia: " + cinemaTicket.getSeatsAvailable());
        cinemaTicket.buyTicket(5);
    }
}
