package abstract_interface.latihan

class Guitar_gro extends Instrument_gro implements Tunable_gro {

    Guitar_gro(String name) {
        super(name)
    }

    @Override
    void play() {
        println("Guitar dimainkan dengan senar")
    }

    @Override
    void tune() {
        println("Guitar sedang di-tuning")
    }
}
