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
                        System.out.println("Enter Title:");
                        String title = scanner.nextLine();
                        System.out.println("Enter Auhtor:");
                        String auhtor = scanner.nextLine();
                        System.out.println("Enter Publication Year:");
                        int year = scanner.nextInt();
                        library.addBook(new Book(isbn, title, auhtor, year));
                        scanner.close();
                        return;
                }
            } catch (Exception e) {

                System.out.println(e.getMessage());
            }

        }
    }
}