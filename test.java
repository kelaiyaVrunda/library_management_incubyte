import org.junit.Test;
//import static org.junit.Assert.*;

public class test {
    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective java", "Joshua Bloch", 2018);
        library.addBook(book);
    }

    @Test
    public void testBorrowBook() {
    Library library = new Library();
    Book book = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        library.addBook(book);
        library.borrowBook("1234");
    }

}