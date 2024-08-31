import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Library Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
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
                    case 2:
                        System.out.println("Enter ISBN of the book to borrow:");
                        isbn = scanner.nextLine();
                        library.borrowBook(isbn);
                        System.out.println("Book borrowed successfully.");
                        break;
                    case 3:
                        System.out.println("Enter ISBN of the book to return:");
                        isbn = scanner.nextLine();
                        library.returnBook(isbn);
                        System.out.println("Book returned successfully.");
                        scanner.close();
                        return;

                }
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        }
    }
}