package Day2.Level1;
import java.util.*;
class Book{
    private String title;
    private String author;
    private double price;

    // Default consructor
    public Book(){
        title = "Lesson of life";
        author = "ABCD";
        price = 1500;

    }

    //Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // method to display
    public void display(){
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

}
public class BookDetail{
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);
        //default contructor
        Book book1 = new Book();
        book1.display();

        //Enter title,author, and price
        System.out.println("Enter title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the name of author: ");
        String author = sc.nextLine();
        System.out.println("Enter the price of a book: ");
        double price = sc.nextDouble();



        //parameterized constructor
        Book book2 = new Book(title, author, price);

        //display th ebook details
        book2.display();

        //close scanner
        sc.close();

    }
}

