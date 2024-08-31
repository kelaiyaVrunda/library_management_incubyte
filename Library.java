
//Map is used to store data in key-value pair
import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    // function to add book
    public void addBook(Book book) {
        if (!books.containsKey(book.getIsbn())) {
            books.put(book.getIsbn(), book);
        } else {
            throw new IllegalArgumentException("Book with this ISBN already exists!");// if book already exists
        }

    }

    // function to borrow book
    public void borrowBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.get(isbn).borrowBook();
        } else {
            throw new IllegalArgumentException("Book not found!");// if book is not found
        }
    }

    // function to return book
    public void returnBook(String isbn) {
        if (books.containsKey(isbn)) {
            books.get(isbn).returnBook();
        } else {
            throw new IllegalArgumentException("Book not found!");// returning book which is not recorded
        }
    }

    // function for available book
    public void viewAvailableBooks() {
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                System.out.println(book);
            } else {
                System.out.println("Book not found.");
            }
        }
    }

    // function to count book that is available
    public int getBooksCount() {
        return books.size();
    }

    public int getAvailableBooksCount() {
        int count = 0;
        for (Book book : books.values()) {
            if (book.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
