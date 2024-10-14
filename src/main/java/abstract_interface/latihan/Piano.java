package abstract_interface.latihan;

public class Piano extends Instrument implements Tunable{
    public Piano(String name) {
        super(name);
    }

    @Override
    void play() {
        System.out.println("Piano dimainkan dengan tuts");
    }

    @Override
    public void tune() {
        System.out.println("Piano sedang di-tuning");
    }
}
