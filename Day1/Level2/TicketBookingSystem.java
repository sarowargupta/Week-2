package Day1.Level2;
import java.util.*;
class MovieTicket {
    // Attributes
    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    // Constructor
    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket() {
        if (isBooked) {
            System.out.println("Seat " + seatNumber + " for movie \"" + movieName + "\" is already booked.");
        } else {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        }
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        // Create a sample MovieTicket object
        System.out.println("Enter the movie name: ");
        String movieName = sc.nextLine();
        System.out.println("Enter the seat number: ");
        int seatNumber = sc.nextInt();
        System.out.println("Enter the ticket price: ");
        double price = sc.nextDouble();

        //create an object of class MovieTicket
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);


        int choice = 0;
        while (choice != 3) {
            System.out.println("\nMovie Ticket Booking System:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Display Ticket Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ticket.bookTicket();
                    break;
                case 2:
                    ticket.displayTicketDetails();
                    break;
                case 3:
                    System.out.println("Thank you for using the Movie Ticket Booking System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        //close scanner
        sc.close();
    }
}



