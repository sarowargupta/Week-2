package com.day6.level1;
import java.util.ArrayList;
import java.util.List;
// Abstract Class: FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    //Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    //getter and setter
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //concrete method to display details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

    //abstract method
    public abstract double calculateTotalPrice();
}

// Interface: Discountable
interface Discountable {
    void applyDiscount(double discountPercentage);
    String getDiscountDetails();
}

// Subclass: VegItem
class VegItem extends FoodItem implements Discountable {
    private double discount;

    //constructor to initialize veg item details
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (calculateTotalPrice() * discountPercentage) / 100;
        System.out.println("Discount applied: " + discount);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Veg Item: " + discount;
    }
}

// Subclass: NonVegItem
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    //constructor to initialize non veg item details
    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (calculateTotalPrice() * discountPercentage) / 100;
        System.out.println("Discount applied: " + discount);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount on Non-Veg Item: " + discount;
    }
}
//Main Class
public class OnlineFoodDeliverySystem {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            System.out.println("Total Price: " + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;

                // Applying 10% discount
                discountable.applyDiscount(10);
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        //class food item reference contain object of subclass
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);

        //list for food item
        List<FoodItem> order = new ArrayList<>();
        order.add(vegItem);
        order.add(nonVegItem);

        //method for order process
        processOrder(order);
    }
}



