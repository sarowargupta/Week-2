package Day3.Level1;
import java.util.*;
class Book{
   //  instance variable
    private String title;
    private String author;
    private final int isbn;

    //class variable shares among all books
    static String libraryName = "Online library ";

    //constructor to initialize details
    public Book(String title, String author , int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    //method to display book details
    public void displayDetails(){
        System.out.println("Book details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Unique identifier: " + isbn);

    }

    //class method to display library name
    public static void displayLibraryName(){
        System.out.println("Library Name: " + libraryName);
    }


}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // create a object for class Book
        Book book1 = new Book("Lesson of life","Sarowar Gupta",101);
        Book book2 = new Book("Happiness is all about","Sarowar",102);

        //check both object is instance of Book class
        if(book1 instanceof Book){
            System.out.println("book1 is instance of class Book");
            book1.displayDetails();
        }
        if(book2 instanceof Book){
            System.out.println("book2 is instance of class Book");
            book2.displayDetails();
        }

        //display the institute name
        Book.displayLibraryName();
    }
}
