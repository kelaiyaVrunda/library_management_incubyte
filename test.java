import org.junit.Test;
//import static org.junit.Assert.*;

public class test {
    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1234");
        library.addBook(book);

    }
}