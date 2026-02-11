import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Library Management System");

        while (running) {
            System.out.println("\n1. View Books | 2. Add Book | 5. Exit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                for (Book b : myLibrary.getAllBooks()) System.out.println(b);
            } else if (choice.equals("2")) {
                System.out.print("Title: "); String t = scanner.nextLine();
                System.out.print("Author: "); String a = scanner.nextLine();
                myLibrary.addBook(new Book(t, a));
            } else if (choice.equals("5")) {
                running = false;
            }
        }
    }
}