import java.util.ArrayList;
import java.util.List;

class Book {
    //attribute
    private String title;
    private String author;

    // Constructor for initializing book detail
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    // Method to get book details as a string
    public String getDetails() {

        return "Title: " + title + ", Author: " + author;
    }
}

class Library {
    //attributes
    private String name;
    private List<Book> books;

    // Constructor for initializing library details
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {

        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }

    public String getName() {

        return name;
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("The Lesson of life", "Sarowar");
        Book book2 = new Book("Vision", "Gupta");
        Book book3 = new Book("Reason for happiness", "Sarowar Gupta");

        // Create libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Village Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        // A book can belong to multiple libraries
        library2.addBook(book2);
        library2.addBook(book3);

        // Display books in libraries
        library1.displayBooks();
        library2.displayBooks();
    }
}
