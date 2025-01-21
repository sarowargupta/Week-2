package Day2.Level1;
import java.util.*;
class BookNote {
    // Instance Variables
    public String ISBN;
    protected String title;
    private String author;

    // Constructor to initialize BookNote object
    public BookNote(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// EBook class (Subclass of BookNote)
class EBook extends BookNote {

    // Constructor to initialize EBook object
    public EBook(String ISBN, String title, String author) {
        // Call the constructor of the superclass (BookNote)
        super(ISBN, title, author);
    }

    // Method to access ISBN and title (from BookNote class)
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN);     // Accessing public variable
        System.out.println("Title: " + title);   // Accessing protected variable
        // Cannot access private variable 'author' directly here, so we use the getter method
        System.out.println("Author: " + getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a BookNote object
        BookNote book1 = new BookNote("1234", "Java Programming", "John Doe");

        // Display the book details
        book1.displayBookDetails();

        // Modify the author's name using the setter method
        System.out.print("Enter new author name for the book: ");
        String newAuthor = "Jane Smith";  // Here you could use Scanner for dynamic input if needed
        book1.setAuthor(newAuthor);
        System.out.println("Updated Book Details:");
        book1.displayBookDetails();

        System.out.println();

        // Create an EBook object
        EBook eBook1 = new EBook("5678", "Advanced Java Programming", "Alex Turner");

        // Display the EBook details
        eBook1.displayEBookDetails();
    }
}

