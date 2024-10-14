package abstract_interface.latihan;

public class Concert {
    public void startConcert(Instrument instrument){
        Tunable tunable = (Tunable) instrument;
        tunable.tune();
        instrument.play();
    }
}
