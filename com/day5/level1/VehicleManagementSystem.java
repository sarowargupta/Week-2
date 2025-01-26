package com.day5.level1;
class Vehicle1 {
    //attribute
    private int maxSpeed;
    private String model;

    // Constructor to initialize vehicle details
    public Vehicle1(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Getter
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}


class ElectricVehicle extends Vehicle1 {
    //attribute
    private int batteryCapacity;

    // Constructor to initialize electric vehicle details
    public ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle1 implements Refuelable {
    //attribute
    private int fuelCapacity;

    // Constructor to initialize petrol vehicle details
    public PetrolVehicle(int maxSpeed, String model, int fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    // Implement refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    // Override displayDetails to include fuel capacity
    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create an ElectricVehicle
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model", 75);
        System.out.println("Electric Vehicle Details:");
        ev.displayDetails();
        ev.charge();
        System.out.println();

        // Create a PetrolVehicle
        PetrolVehicle pv = new PetrolVehicle(180, "Toyota ", 50);
        System.out.println("Petrol Vehicle Details:");
        pv.displayDetails();
        pv.refuel();
    }
}

