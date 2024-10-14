package polymorphism.latihan;

public class MusicPlayer {
    public static void main(String[] args) {
        Instrument piano = new Piano();
        Instrument guitar = new Guitar();
        Instrument flute = new Flute();

        piano.play();
        guitar.play();
        flute.play();
    }
}
