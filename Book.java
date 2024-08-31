public class Book {
    private String isbn; // isbn which is unique
    private String title; // book title
    private String author; // author name
    private int publicationYear; // publish year of book
    private boolean isAvailable; // whether book is available or not

    // constructor for following object

    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;

    }

    // fetch isbn from data

    public String getIsbn() {
        return isbn;
    }

    // fetch title from data

    public String getTitle() {
        return title;
    }

    // fetch author from data

    public String getAuthor() {
        return author;
    }

    // fetch year when book was published from data

    public int getpublicationYear() {
        return publicationYear;
    }

    // fetch book if available

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            throw new IllegalStateException("Book is already Borrowed!");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    // return the data added
    public String toString() {
        return "ISBN:" + isbn + ", Title:" + title + ",Auhtor:" + author + ",Year:" + publicationYear + ", Available:"
                + isAvailable;

    }
}