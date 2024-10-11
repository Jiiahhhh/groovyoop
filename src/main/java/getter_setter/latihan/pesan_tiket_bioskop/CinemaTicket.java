package getter_setter.latihan.pesan_tiket_bioskop;

public class CinemaTicket {
    private String movieTitle;
    private double ticketPrice;
    private int seatsAvailable;
    boolean isPremium = false;

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice > 50000) {
            this.ticketPrice = ticketPrice;
        } else {
            System.out.println("Harga tiket kemurahan bosku");
        }
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        if (seatsAvailable > 0) {
            this.seatsAvailable = seatsAvailable;
        } else {
            System.out.println("Sorry, kursinya lupa dipasang");
        }
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        if (premium) {
            ticketPrice = ticketPrice + (ticketPrice * 0.5);
            isPremium = premium;
        } else {
            isPremium = premium;
        }

    }

    public void buyTicket(int seats){
        if (seatsAvailable < seats) {
            System.out.println("Sudah Habis!");
        } else {
            seatsAvailable -= seats;
            System.out.println("Tiket Berhasil Dipesan untuk seats: " + seats + " orang");
        }
    }
}
