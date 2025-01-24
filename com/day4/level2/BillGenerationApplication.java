import java.util.ArrayList;
import java.util.List;
class Customer {
    //attribute
    private String name;
    private List<Product> products;

    // Constructor to initialize customer details
    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to get the list of products
    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

class Product {
    private String name;
    private double pricePerUnit;
    private double quantity;

    // Constructor to initialize product details
    public Product(String name, double pricePerUnit, double quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    // Method to calculate total price for the product
    public double calculateTotal() {
        return pricePerUnit * quantity;
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }
}
class BillGenerator {
    // Method to generate the bill for a customer
    public void generateBill(Customer customer) {
        System.out.println("Bill for " + customer.getName() + ":");
        double totalAmount = 0;

        for (Product product : customer.getProducts()) {
            double productTotal = product.calculateTotal();
            totalAmount += productTotal;
        }

        System.out.println("Total Amount: " + totalAmount);
    }
}

public class BillGenerationApplication {
    public static void main(String[] args) {
        // Create a customer
        Customer customer = new Customer("Alice");

        // Add products
        customer.addProduct(new Product("Apples", 3.0, 2));
        customer.addProduct(new Product("Milk", 2.0, 1));

        // Generate bill
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer);
    }
}
