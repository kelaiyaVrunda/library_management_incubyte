import org.junit.Test;
import static org.junit.Assert.*;

public class test {
    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective java", "Joshua Bloch", 2018);
        library.addBook(book);
        assertEquals(1, library.getBooksCount());
    }

    @Test
    public void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        library.addBook(book);
        library.borrowBook("1234");
        assertFalse(book.isAvailable());
        assertEquals(0, library.getAvailableBooksCount());
    }

    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        library.addBook(book);
        library.borrowBook("1234");
        library.returnBook("1234");
        assertEquals(1, library.getAvailableBooksCount());  
    }

    @Test
    public void testAvailableBooksAfterAdding() {
        Library library = new Library();
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("5678", "Clean Code", "Robert C. Martin", 2008);

        library.addBook(book1);
        library.addBook(book2);
    }

}