package com.day6.level1;
import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    //constructor to initialize vehicle details
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    //getter and setter
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    //abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);
}

// Interface Insurable
interface Insurable {
    double calculateInsurance();

    String getInsuranceDetails();
}

// Car class
class Car extends Vehicle implements Insurable {
    private static final double insuranceRate = 0.02;

    //constructor to initialize car details
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance rate: " + (insuranceRate * 100) + "%";
    }
}

// Bike class
class Bike extends Vehicle implements Insurable{
    private static final double insuranceRate = 0.02;

    //constructor to initialize bike details
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance rate: " + (insuranceRate * 100) + "%";
    }
}

// Truck class
class Truck extends Vehicle implements Insurable {
    private static final double insuranceRate = 0.05;

    //constructor to initialize truck details
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance rate: " + (insuranceRate* 100) + "%";
    }
}

// Main class showcasing polymorphism
public class VehicleRentalSystem {

    //method to calculate cost
    public static void calculateCosts(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;
            String insuranceDtails = " ";

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable)vehicle;
                insuranceCost = insurableVehicle.calculateInsurance();
                insuranceDtails = insurableVehicle.getInsuranceDetails();
            }

            //display details
            System.out.println("Vehicle details");
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle: " + vehicle.getType());
            System.out.println("Rental Rate: " + vehicle.getRentalRate());
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println(insuranceDtails);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //List for vehicle
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new Car("C001", "Car", 50.00));
        vehicleList.add(new Bike("B001", "Bike", 20.00));
        vehicleList.add(new Truck("T001", "Truck", 100.00));

        calculateCosts(vehicleList, 5);
    }
}
