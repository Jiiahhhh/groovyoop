package polymorphism.latihan.sistem_perpustakaan;

public class Book extends MediaItem {
    int numPages;

    public Book(String title, String author, int numPages) {
        super(title, author);
        this.numPages = numPages;
    }

    @Override
    void checkout() {
        System.out.println("Buku berjudul " + title + " dengan " + numPages + " halaman telah dipinjam.");
    }
}