package Day2.Level1;
import java.util.*;
class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable (shared among all Product objects)
    static int totalProducts = 0;

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts each time a new product is created
    }

    // Instance Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class Method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking input for the first product
        System.out.println("Enter Product 1 Name: ");
        String productName1 = sc.nextLine();
        System.out.println("Enter Product 1 Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        // Creating Product objects using user input
        Product product1 = new Product(productName1, price1);

        // Taking input for the second product
        System.out.println("Enter Product 2 Name: ");
        String productName2 = sc.nextLine();
        System.out.println("Enter Product 2 Price: ");
        double price2 = sc.nextDouble();
        sc.nextLine();

        Product product2 = new Product(productName2, price2);

        // Displaying individual product details
        System.out.println("\nProduct 1 Details:");
        product1.displayProductDetails();
        System.out.println();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();
        System.out.println();


        // Displaying total number of products created
        Product.displayTotalProducts();

        // Close the scanner
        sc.close();
    }
}


