import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n Library Management System");
            System.out.println("1. Add Book");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Enter ISBN:");
                        String isbn = scanner.nextLine();
                        library.addBook(new Book(isbn));
                        scanner.close();
                        return;
                }
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        }
    }
}