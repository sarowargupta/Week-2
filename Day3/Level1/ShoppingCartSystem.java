package Day3.Level1;
import java.util.*;
class Product{
    //instance variable
    private String productName;
    private double price;
    private int quantity;
    private final String productID;

    //class variable share among all product
    static double discount =5;

    // constructor to initialize the product deatils
    public Product(String productName,double price,int quantity,String productID){
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    //method to calculate price after discount
    public double calculatePrice(double price,int quantity){
        price = (price*quantity)*(1-discount/100);
        return price;
    }

    //method to display details of product
    public void displayDetails(){
        System.out.println("Product Details: ");
        System.out.println("Product Name: " + productName);
        System.out.println("ProductID: " + productID);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + calculatePrice(price,quantity));
    }

    //method to update discount percentage
    public static void updateDiscount(double newdiscount){
        discount = newdiscount;
    }


}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //create an object for Product
        Product product1 = new Product("ABCD",1200,3,"101A");
        Product product2 = new Product("EFGH",1500,2,"102B");

        //check object is an instance of class Product
        if(product1 instanceof Product){
            System.out.println("Product1 is instance of class Product ");
            product1.displayDetails();
        }
        if(product2 instanceof Product){
            System.out.println("Product2 is instance of class Product ");
            product2.displayDetails();
        }

        //update the discount for all product
        System.out.println("Enter new discount price: ");
        double newDiscount = sc.nextDouble();
        Product.updateDiscount(newDiscount);

        //Display the details of product after updating discount
        System.out.println("Details after updating the discount: ");
        product1.displayDetails();
        product2.displayDetails();
    }
}
