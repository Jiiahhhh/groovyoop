package polymorphism.latihan.sistem_perpustakaan;

public class cekMediaItem {
    public static void main(String[] args) {
        MediaItem book = new Book("The Java Handbook", "John Doe", 500);
        MediaItem dvd = new DVD("Inception", "Chrisotpher Nolan", 2.5);
        MediaItem magazine = new Magazine("Tech Today", "", 42);

        Library library = new Library();

        library.processCheckout(book);
        library.processCheckout(dvd);
        library.processCheckout(magazine);
    }
}
