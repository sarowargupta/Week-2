import java.util.ArrayList;
import java.util.List;

class Products {
    //attribute
    private String name;
    private double price;

    // Constructor to initialize product details
    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    //attribute
    private int orderId;
    private List<Products> products;

    // Constructor to initialize order details
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Products product) {
        products.add(product);
    }

    // Method to list all products in the order
    public void listProducts() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Products product : products) {
            System.out.println("- " + product.getName() + ", Price: " + product.getPrice());
        }
    }

    public int getOrderId() {
        return orderId;
    }
}

class CusTomer {
    //attribute
    private String name;
    private List<Order> orders;

    // Constructor to initialize customer details
    public CusTomer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed order ID: " + order.getOrderId());
    }

    // Method to list all orders of the customer
    public void listOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.listProducts();
        }
    }

    public String getName() {
        return name;
    }
}

class ECommercePlatform {
    private String name;

    // Constructor to initialize ECommercePlatform details
    public ECommercePlatform(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        // Create an e-commerce platform
        ECommercePlatform platform = new ECommercePlatform("ShopEasy");

        // Create products
        Products laptop = new Products("Laptop", 1200.00);
        Products phone = new Products("Phone", 800.00);
        Products tablet = new Products("Tablet", 500.00);

        // Create customers
        CusTomer alice = new CusTomer("Alice");
        CusTomer bob = new CusTomer("Bob");

        // Create orders
        Order order1 = new Order(101);
        order1.addProduct(laptop);
        order1.addProduct(phone);

        Order order2 = new Order(102);
        order2.addProduct(tablet);

        // Customers place orders
        alice.placeOrder(order1);
        bob.placeOrder(order2);

        // List customer orders
        alice.listOrders();
        bob.listOrders();
    }
}

