package Day2.Level1;
import java.util.*;
class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable (shared among all vehicles)
    static double registrationFee = 150.00;

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class Method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee; // Change the registration fee for all vehicles
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input details for the first vehicle
        System.out.println("Enter Owner Name for Vehicle 1: ");
        String ownerName1 = sc.nextLine();
        System.out.println("Enter Vehicle Type for Vehicle 1: ");
        String vehicleType1 = sc.nextLine();

        // Create the first vehicle object
        Vehicle vehicle1 = new Vehicle(ownerName1, vehicleType1);

        // Input details for the second vehicle
        System.out.println("Enter Owner Name for Vehicle 2: ");
        String ownerName2 = sc.nextLine();
        System.out.println("Enter Vehicle Type for Vehicle 2: ");
        String vehicleType2 = sc.nextLine();

        // Create the second vehicle object
        Vehicle vehicle2 = new Vehicle(ownerName2, vehicleType2);

        // Display vehicle details before updating the registration fee
        System.out.println("\nBefore Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        System.out.println();

        // Input the new registration fee
        System.out.println("Enter new Registration Fee: $");
        double newFee = sc.nextDouble();

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(newFee);

        // Display vehicle details after updating the registration fee
        System.out.println("\nAfter Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        // Close the scanner
        sc.close();
    }
}

