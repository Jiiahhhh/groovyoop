package polymorphism.latihan.sistem_perpustakaan;

public class Magazine extends MediaItem{
    int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    void checkout() {
        System.out.println("Majalan berjudul " + title + " dengan edisi " + issueNumber + " telah dipinjam.");
    }
}
