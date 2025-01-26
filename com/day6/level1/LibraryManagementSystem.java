package com.day6.level1;
// Abstract Class: LibraryItem
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    //constructor to initialize library item details
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    //getter and setter
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    //abstract method to get duration
    public abstract int getLoanDuration();
}

// Interface: Reservable
interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

// Subclass: Book
class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    //constructor to initialize book details
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days loan duration for books
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Book reserved by " + borrower);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass: Magazine
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    //constructor to initialize Magazine  details
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {

        // 7 days loan duration for magazines
        return 7;
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Magazine reserved by " + borrower);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass: DVD
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    //constructor to initialize dvd details
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days loan duration for DVDs
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            isReserved = true;
            System.out.println("DVD reserved by " + borrower);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem book = new Book(1, "Happiness", "Sarowar");
        LibraryItem magazine = new Magazine(2, "Time", "Gupta");
        LibraryItem dvd = new DVD(3, "Turning Point", "Sarowar Gupta");

        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("John");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
            }

            System.out.println();
        }
    }
}

