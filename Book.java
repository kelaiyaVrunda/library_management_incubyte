public class Book {
    private String isbn;

    public Book(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String toString() {
        return "ISBN:" + isbn;
    }
}