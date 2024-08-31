import org.junit.Test;
import static org.junit.Assert.*;

public class test {

    // book added
    
    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective java", "Joshua Bloch", 2018);
        library.addBook(book);
        assertEquals(1, library.getBooksCount());
    }

    // adding multiple book
    @Test
    public void testAddMultipleBooks() {
        Library library = new Library();
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("5678", "Clean Code", "Robert C. Martin", 2008);
        Book book3 = new Book("91011", "Refactoring", "Martin Fowler", 1999);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Check if the book count is now 3
        assertEquals(3, library.getBooksCount());
    }
    // adding duplicate book

    @Test(expected = IllegalArgumentException.class)
    public void testAddDuplicateBook() {
        Library library = new Library();
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);

        library.addBook(book1);
        // Attempting to add a duplicate book should throw an IllegalArgumentException
        library.addBook(book2);
    }

    // Book borrowed

    @Test
    public void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        library.addBook(book);
        library.borrowBook("1234");
        assertFalse(book.isAvailable());
        assertEquals(0, library.getAvailableBooksCount());
    }
    // borrowing non existing book

    @Test(expected = IllegalArgumentException.class)
    public void testBorrowNonExistentBook() {
        Library library = new Library();

        // Attempt to borrow a book that doesn't exist in the library
        library.borrowBook("9999");
    }

    // borrow already borrowed book

    @Test(expected = IllegalStateException.class)
    public void testBorrowAlreadyBorrowedBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        library.addBook(book);

        // Borrow the book once
        library.borrowBook("1234");

        // Attempt to borrow the same book again (should throw an exception)
        library.borrowBook("1234");
    }

    // Return Book

    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        library.addBook(book);
        library.borrowBook("1234");
        library.returnBook("1234");
        assertEquals(1, library.getAvailableBooksCount());
    }
    // return non existing book

    @Test(expected = IllegalArgumentException.class)
    public void testReturnNonExistentBook() {
        Library library = new Library();

        // Attempt to return a book that doesn't exist in the library
        library.returnBook("9999");
    }

    // Available Books

    @Test
    public void testAvailableBooksAfterAdding() {
        Library library = new Library();
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("5678", "Clean Code", "Robert C. Martin", 2008);

        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getAvailableBooksCount());
    }

    // available book after borrow

    @Test
    public void testAvailableBooksAfterBorrowing() {
        Library library = new Library();
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("5678", "Clean Code", "Robert C. Martin", 2008);

        library.addBook(book1);
        library.addBook(book2);

        // Borrow one book
        library.borrowBook("1234");

        // Only one book should be available now
        assertEquals(1, library.getAvailableBooksCount());
    }

    // available book after return

    @Test
    public void testAvailableBooksAfterReturning() {
        Library library = new Library();
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);
        Book book2 = new Book("5678", "Clean Code", "Robert C. Martin", 2008);

        library.addBook(book1);
        library.addBook(book2);

        // Borrow and then return one book
        library.borrowBook("1234");
        library.returnBook("1234");

        // Both books should be available again
        assertEquals(2, library.getAvailableBooksCount());
    }
    // No book available
    @Test
    public void testNoAvailableBooks() {
        Library library = new Library();
        Book book1 = new Book("1234", "Effective Java", "Joshua Bloch", 2018);

        
        library.addBook(book1);

        
        // Borrow all books
        library.borrowBook("1234");

        
        // No books should be available
        assertEquals(0, library.getAvailableBooksCount());
    }
}