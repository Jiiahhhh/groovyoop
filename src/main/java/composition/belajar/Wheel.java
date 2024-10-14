package composition.belajar;

public class Wheel {
    private int size;

    public Wheel(int size) {
        this.size = size;
    }

    public void rotate() {
        System.out.println("Roda berukuran " + size + " inci berputar.");
    }
}