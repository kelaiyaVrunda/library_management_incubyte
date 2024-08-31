
//to take user input import scanner class
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Enter the choice to select the operations

        while (true) {
            System.out.println("\n Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book:");
            System.out.println("4. Available Books:");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    // code to add book

                    case 1:
                        System.out.println("Enter ISBN:");
                        String isbn = scanner.nextLine();
                        System.out.println("Enter Title:");
                        String title = scanner.nextLine();
                        System.out.println("Enter Auhtor:");
                        String auhtor = scanner.nextLine();
                        System.out.println("Enter Publication Year:");
                        int year = scanner.nextInt();
                        library.addBook(new Book(isbn, title, auhtor, year));
                        System.out.println("Book added successfully.");
                        break;

                    // code to borrow the book

                    case 2:
                        System.out.println("Enter ISBN of the book to borrow:");
                        isbn = scanner.nextLine();
                        library.borrowBook(isbn);
                        System.out.println("Book borrowed successfully.");
                        break;

                    // code to return book

                    case 3:
                        System.out.println("Enter ISBN of the book to return:");
                        isbn = scanner.nextLine();
                        library.returnBook(isbn);
                        System.out.println("Book returned successfully.");
                        break;

                    // code to see available books

                    case 4:
                        System.out.println("Available Books:");
                        library.viewAvailableBooks();
                        break;

                    // code to exit system

                    case 5:
                        System.out.println("Exiting System....");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        }
    }
}