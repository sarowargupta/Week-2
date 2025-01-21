package Day2.Level1;
import java.util.*;
class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0; // Example daily rental rate

    // Constructor to initialize car rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Rental Cost: " + calculateTotalCost());
    }
}
public class CarRentalSystem {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input customer name
        System.out.println("Enter Customer Name: ");
        String customerName = sc.nextLine();

        // Input car model
        System.out.println("Enter Car Model: ");
        String carModel = sc.nextLine();

        // Input rental days
        System.out.println("Enter Rental Days: ");
        int rentalDays = sc.nextInt();

        // Create a CarRental object with user input
        CarRental rental1 = new CarRental(customerName, carModel, rentalDays);

        // Display rental details and total cost
        rental1.displayRentalDetails();

        // Close the scanner
        sc.close();
    }
}
