package Day3.Level1;
import java.util.*;
class Vehicle{
    //instance variable
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    //class variable share among all vehicle
    static double registrationFee =500;

    // constructor to initialize the vehicle details
    public Vehicle(String ownerName,String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;

    }

    //method to display details of vehicle
    public void displayDetails(){
        System.out.println("Vehicle Details: ");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("VehicleType: " + vehicleType);
        System.out.println("registrationNumber: " + registrationFee);

    }

    //method to update registrationfee
    public static void updateRegistrationFee(double newFee){
        registrationFee = newFee;
    }


}
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //create an object for Vehicle
        Vehicle car = new Vehicle("ABCD","CAR","101A");
        Vehicle bike = new Vehicle("EFGH","BIKE","102B");

        //check object is an instance of class Vehicle
        if(car instanceof Vehicle){
            System.out.println("car is instance of class Vehicle ");
            car.displayDetails();
        }
        if(bike instanceof Vehicle){
            System.out.println("Bike is instance of class Vehicle ");
            bike.displayDetails();
        }

        //update the registration fee for all vehicle
        System.out.println("Enter new registrationfee price: ");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        //Display the details of vehicle after updating new registration fee
        System.out.println("Details after updating the discount: ");
        car.displayDetails();
        bike.displayDetails();
    }
}


