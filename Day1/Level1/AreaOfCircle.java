package Day1.Level1;
import java.util.*;
class Area{
    private double radius;

    //constructor
    Area(double radius){
        this.radius = radius;
    }

    //method to calculate the circumference of circle
    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    // method to calculate area of the circle
    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    //mrthod th display the area and cicumference
    public void displayDetails(){
        System.out.println("Area of the Circle: " + calculateArea());
        System.out.println("circumference of the Circle: " + calculateCircumference());
    }

}
public class AreaOfCircle {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //enter the radius of circle
        System.out.println("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        //create a object of class
        Area area = new Area(radius);

        //Display the area and circumference
        area.displayDetails();

        // close scanner
        sc.close();
    }
}
