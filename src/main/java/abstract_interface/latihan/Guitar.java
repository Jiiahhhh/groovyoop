package abstract_interface.latihan;

public class Guitar extends Instrument implements Tunable{

    public Guitar(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println("Guitar dimainkan dengan senar.");
    }

    @Override
    public void tune() {
        System.out.println("Guitar sedang di-tuning.");
    }
}
