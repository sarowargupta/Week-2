package Day2.Level1;
import java.util.*;
class HotelBooking{
    //attribute
    private String guestName;
    private String roomType;
    private int nights;

        // Default constructor
    public HotelBooking() {
        guestName = "Guest";
        roomType = "Standard Room";
        nights = 1;
        }

        // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        }

        // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        }

        // Method to display booking details
        public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
        }
    }

public class HotelBookingSystem {
    public static void main(String[] args) {
        // create a scanner object
        Scanner sc = new Scanner(System.in);

        //creating a HotelBooking object using default constructor
        HotelBooking defaultBooking = new HotelBooking();
        System.out.println("Default Booking:");
        defaultBooking.displayBookingDetails();

        //enter guest name,roomtype,and nights
        System.out.println("Enter name");
        String guestName = sc.nextLine();
        System.out.println("Enter room type");
        String roomType = sc.nextLine();
        System.out.println("Enter nights");
        int nights = sc.nextInt();

        //creating a HotelBooking object using parameterized constructor
        HotelBooking parameterizedBooking = new HotelBooking(guestName,roomType,nights);
        System.out.println("\nParameterized Booking:");
        parameterizedBooking.displayBookingDetails();

        //creating a HotelBooking object using copy constructor
        HotelBooking copiedBooking = new HotelBooking(parameterizedBooking);
        System.out.println("\nCopied Booking:");
        copiedBooking.displayBookingDetails();

        //close scanner
        sc.close();
    }
}
