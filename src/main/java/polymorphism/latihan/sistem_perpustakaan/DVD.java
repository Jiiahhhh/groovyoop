package polymorphism.latihan.sistem_perpustakaan;

public class DVD extends MediaItem{
    double duration;

    public DVD(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    void checkout() {
        System.out.println("DVD berjudul " + title + " dengan durasi " + duration + " jam telah dipinjam." );
    }
}
