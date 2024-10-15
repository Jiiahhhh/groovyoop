package abstract_interface.latihan

class Concert_gro {
    void startConcert(Instrument_gro instrument_gro){
        Tunable_gro tunable_gro = (Tunable_gro) instrument_gro;
        instrument_gro.play()
    }
}
