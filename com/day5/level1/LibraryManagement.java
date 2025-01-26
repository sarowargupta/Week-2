package com.day5.level1;
class Book{
    //attribute
    private String title;
    private int  publicationYear;

    // constructor to initialize book details
    public Book(String title,int publicationYear){
        this.title = title;
        this.publicationYear= publicationYear;
    }

    //getters
    public String getTitle(){
        return title;
    }
    public int getPublicationYear(){
        return publicationYear;
    }
}
class Author extends Book {
    //unique attribute
    private String name;
    private String bio;

    //constructor to initialize author details
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    //method to display details of book and its author
    public void displayInfo() {
        System.out.println("Details of book: ");
        System.out.println("Title of book: " + getTitle());
        System.out.println("publication year of book: " + getPublicationYear());
        System.out.println("Details of author: ");
        System.out.println("Name of author: " + name + "\n Bio is: " + bio);

    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author("Happiness Of Life",2025,"Sarowar Gupta","There is the story about happy life:");
        author.displayInfo();
    }
}
