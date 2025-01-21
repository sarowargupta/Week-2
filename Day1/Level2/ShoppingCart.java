package Day1.Level2;
import java.util.*;
class CartItem {
    // Attributes
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Method to get the total price of the item
    public double getTotalPrice() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getTotalPrice());
    }
}
public class ShoppingCart {
    public static void main(String[] args) {
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        // Define a fixed-size array for the cart and a variable to track the number of items
        CartItem[] cart = new CartItem[10]; // Maximum of 10 items
        int itemCount = 0;

        int choice = 0;
        while (choice != 4) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Remove Item from Cart");
            System.out.println("3. Display Total Cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    // Add item to cart
                    if (itemCount < cart.length) {
                        System.out.print("Enter item name: ");
                        String itemName = sc.nextLine();
                        System.out.print("Enter price: ");
                        double price = sc.nextDouble();
                        System.out.print("Enter quantity: ");
                        int quantity = sc.nextInt();

                        cart[itemCount] = new CartItem(itemName, price, quantity);
                        itemCount++;
                        System.out.println("Item added to cart.");
                    } else {
                        System.out.println("Cart is full. Cannot add more items.");
                    }
                    break;

                case 2:
                    // Remove item from cart
                    System.out.print("Enter item name to remove: ");
                    String removeItemName = sc.nextLine();
                    boolean itemRemoved = false;

                    for (int i = 0; i < itemCount; i++) {
                        if (cart[i].getItemName().equalsIgnoreCase(removeItemName)) {
                            // Shift items to fill the gap
                            for (int j = i; j < itemCount - 1; j++) {
                                cart[j] = cart[j + 1];
                            }
                            cart[itemCount - 1] = null; // Clear the last item
                            itemCount--;
                            itemRemoved = true;
                            System.out.println("Item removed from cart.");
                            break;
                        }
                    }

                    if (!itemRemoved) {
                        System.out.println("Item not found in the cart.");
                    }
                    break;

                case 3:
                    // Display total cost
                    if (itemCount == 0) {
                        System.out.println("The cart is empty.");
                    } else {
                        double totalCost = 0;
                        System.out.println("Cart Details:");
                        for (int i = 0; i < itemCount; i++) {
                            cart[i].displayItemDetails();
                            totalCost += cart[i].getTotalPrice();
                        }
                        System.out.println("Total Cost: $" + totalCost);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for shopping! Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        // close scanner
        sc.close();
    }
}



