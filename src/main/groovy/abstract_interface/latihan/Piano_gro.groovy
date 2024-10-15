package abstract_interface.latihan

class Piano_gro extends Instrument_gro implements Tunable_gro{

    Piano_gro(String name) {
        super(name)
    }

    @Override
    void play() {
        println("Piano dimainkan dengan tuts")
    }

    @Override
    void tune() {
        println("Piano sedang di-tuning")
    }
}
