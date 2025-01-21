package Day1.Level1;
import java.util.*;
class Item{
    private String itemCode;
    private String itemName;
    private double price;

    //condtructor
    public Item(String itemCode, String itemName, double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    //method for display details of item
    public void display(){
        System.out.println("Item details");
        System.out.println("Item Code: " + itemCode);
        System.out.println("price: " + price);
    }

    //method for calculate tital price
    public double calculateTotalCost(int quantity){
        return quantity*price;
    }
}
public class InventoryOfItems{
    public static void main(String[] args){
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //Enter itemcode,itemName and price
        System.out.println("Enter item code: ");
        String itemCode = sc.nextLine();
        System.out.println("Enter item Name: ");
        String itemName = sc.nextLine();
        System.out.println("Enter the price of item:");
        double price = sc.nextDouble();

        // create a object of class
        Item item = new Item(itemCode,itemName,price);

        //display
        item.display();

        //enter quantity
        System.out.println("Enter quantity of item that want");
        int quantity = sc.nextInt();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost of " + quantity + " item " + totalCost);

        //close scanner
        sc.close();
    }
}
