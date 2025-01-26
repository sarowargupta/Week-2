package com.day6.level1;
import java.util.*;
//abstract class Product
abstract class Product{
    private String productId;
    private String name;
    private double price;

    //Constructor to initialize product details
    Product(String productId,String name,double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    //getter and setter
    public String getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setEmployeeId(String productId){
        this.productId = productId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double price){
        this.price = price;
    }
    //abstract method to calculate discount
    abstract double calculateDiscount();

}
//Interface class
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}
// Electronics class
class Electronics extends Product implements Taxable {
    private static final double taxRate = 0.15;
    private static final double discountRate = 0.10;

    //constructor to initialize electronic product details
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics tax rate: " + (taxRate* 100) + "%";
    }

}
//subclass clothing
class Clothing extends Product implements Taxable {
    private static final double taxRate = 0.08;
    private static final double discountRate = 0.20;

    //constructor to initialize clothing details
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing tax rate: " + (taxRate * 100) + "%";
    }

}
// Groceries class
class Groceries extends Product implements Taxable {
    private static final double taxRate = 0.05;
    private static final double discountRate = 0.20;

    //constructor to initialize groceries details
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing tax rate: " + (taxRate * 100) + "%";
    }

}
// Main class showcasing polymorphism
public class EcommercePlatform {
    //method to calculate  final price
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            String taxDetails = "No tax applicable";

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                tax = taxableProduct.calculateTax();
                taxDetails = taxableProduct.getTaxDetails();
            }
            double finalPrice = product.getPrice() + tax - discount;

            //display details
            System.out.println("Product details: ");
            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax + " (" + taxDetails + ")");
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //list for products
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("1001A", "Smartphone", 20000));
        products.add(new Clothing("1002A", "T-Shirt", 1000));
        products.add(new Groceries("1003A", "Apples", 200));

        calculateFinalPrice(products);

    }

}