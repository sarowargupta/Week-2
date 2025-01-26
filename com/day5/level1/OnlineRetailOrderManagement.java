package com.day5.level1;
class Order {
    //attribute
    private String orderId;
    private String orderDate;

    // Constructor to initialize order details
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Getter
    public String getOrderId() {
        return orderId;
    }
    public String getOrderDate() {
        return orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order Details: ");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    //attribute
    private String trackingNumber;

    // Constructor to initialize ShippedOrder details
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order shipped with tracking number: " + trackingNumber;
    }

    @Override
    public void displayOrderDetails() {

        // Call superclass method
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder {
    //attribute
    private String deliveryDate;

    // Constructor to initialize  DeliveredOrder details
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    @Override
    public void displayOrderDetails() {

        // Call superclass method
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}


public class OnlineRetailOrderManagement{
    public static void main(String[] args) {
        // Create a base order
        Order order = new Order("O001", "2025-01-20");
        order.displayOrderDetails();
        order.getOrderStatus();
        System.out.println();

        // Create a shipped order
        ShippedOrder shippedOrder = new ShippedOrder("O002", "2025-01-21", "TRACK12345");
        shippedOrder.displayOrderDetails();
        shippedOrder.getOrderStatus();
        System.out.println();

        // Create a delivered order
        DeliveredOrder deliveredOrder = new DeliveredOrder("O003", "2025-01-22", "TRACK54321", "2025-01-24");
        deliveredOrder.displayOrderDetails();
        deliveredOrder.getOrderStatus();
    }
}
