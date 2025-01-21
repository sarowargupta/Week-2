package Day1.Level1;
import java.util.*;
class MobilePhone{
    private String brand;
    private String model;
    private double price;

    //constructor
    public MobilePhone(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price =price;
    }
    //method to display details of mobile
    public void display(){
        System.out.println("Mobile phone details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

}

public class MobilePhoneDetails {
    public static void main(String[] args){
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //enter brand,model and price of a mobile phone
        System.out.println("Enter the brand of mobile phone");
        String brand = sc.nextLine();
        System.out.println("Enter model of mobile phone");
        String model = sc.nextLine();
        System.out.println("Enter price of mobile phone");
        double price = sc.nextDouble();

        //create an object of class MobilePhone
        MobilePhone phone = new MobilePhone(brand,model,price);

        //display
        phone.display();

        //close the scanner
        sc.close();
    }
}


