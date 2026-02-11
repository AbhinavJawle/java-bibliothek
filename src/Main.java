import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Library Management System");

        while (running) {
            System.out.println("\n1. View Books | 2. Add Book | 3. Borrow | 4. Return | 5. Exit");
            System.out.print("Choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\nTitle                | Author          | Status");
                    System.out.println("---------------------------------------------------");
                    for (Book b : myLibrary.getAllBooks()) System.out.println(b);
                    break;
                case "2":
                    System.out.print("Enter Title: ");
                    String t = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String a = scanner.nextLine();
                    myLibrary.addBook(new Book(t, a));
                    break;
                case "3":
                    System.out.print("Title to borrow: ");
                    String bTitle = scanner.nextLine();
                    if (myLibrary.borrowBook(bTitle)) System.out.println("Success!");
                    else System.out.println("Not available.");
                    break;
                case "4":
                    System.out.print("Enter the title of the book you are returning: ");
                    String rTitle = scanner.nextLine();

                    myLibrary.returnBook(rTitle);

                    System.out.println("Process complete. Check the book list to confirm the status.");
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
        scanner.close();
    }
}