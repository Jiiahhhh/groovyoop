package abstract_interface.latihan

class Main {
    static void main(String[] args) {
        Guitar_gro guitar_gro = new Guitar_gro("Guitar");
        Piano_gro piano_gro = new Piano_gro("Piano")

        Concert_gro concert_gro = new Concert_gro()
        concert_gro.startConcert (guitar_gro)
        concert_gro.startConcert (piano_gro)
    }
}
