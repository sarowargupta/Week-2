package Day2.Level1;
import java.util.*;
class Circle{
   private double radius;

    // Default constructor
    public Circle() {
        radius = 1.0;
    }

    //parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display circle details
    public void display() {
        System.out.println("Circle Details:");
        System.out.println("Radius: " + radius);
    }

}
public class CircleDetails {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner sc = new Scanner(System.in);

        // Create a Circle object using the default constructor
        Circle defaultcircle1 = new Circle();
        System.out.println("Default Constructor:");
        defaultcircle1.display();

        //create a circle object using parameterized constructor
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        Circle usercircle2 = new Circle(radius);
        //display
        usercircle2.display();

         // close scanner
        sc.close();
    }
}
