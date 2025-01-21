package Day2.Level1;
import java.util.*;
class Books {
    //attribute
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize the book attributes
    public Books(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            System.out.println("The book \"" + title + "\" has been borrowed.");
            isAvailable = false;
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
        }
    }
}

public class LibraryBookSystem {
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);
        boolean isAvailable = true;

        //enter title,author ,price of the book
        System.out.println("title of the book");
        String title = sc.nextLine();
        System.out.println("author of book");
        String author = sc.nextLine();
        System.out.println("price of the book");
        double price = sc.nextDouble();

        //parameterized constuctor
        Books book = new Books(title,author,price,isAvailable);

        //display
        book.displayDetails();

        //borrow book
        System.out.println(" borrow the book...");
        book.borrowBook();

        // Display book details again to see the updated availability
        System.out.println("Updated Book Details:");
        book.displayDetails();

        // Trying to borrow the book again
        System.out.println("borrow the book again...");
        book.borrowBook();
    }
}
