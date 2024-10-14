package abstract_interface.latihan;

public class cekConcert {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("Guitar");
        Piano piano = new Piano("Piano");

        Concert concert = new Concert();
        concert.startConcert(guitar);
        concert.startConcert(piano);
    }
}
