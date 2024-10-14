package polymorphism.latihan.sistem_perpustakaan;

abstract class MediaItem {
    String title;
    String author;

    public MediaItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void checkout();
}
