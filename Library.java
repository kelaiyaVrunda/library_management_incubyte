import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        if (!books.containsKey(book.getIsbn())) {
            books.put(book.getIsbn(), book);
        } else {
            throw new IllegalArgumentException("Book with this ISBN already exists!");
        }

    }

    public void borrowBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.get(isbn).borrowBook();
        } else {
            throw new IllegalArgumentException("Book not found!");
        }
    }

}