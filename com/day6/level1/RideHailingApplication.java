package com.day6.level1;
import java.util.ArrayList;
import java.util.List;

// Abstract Class: Vehicles
abstract class Vehicles {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    //Constructor to initialize Vehicles details
    public Vehicles(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    //getter and setter
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    //concrete method to display details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    //abstract method
    public abstract double calculateFare(double distance);
}

// Interface: GPS
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Subclass: Car
class Cars extends Vehicles implements GPS {
    private String currentLocation;

    //Constructor to initialize car detail
    public Cars(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass: Bike
class Bikes extends Vehicles implements GPS {
    private String currentLocation;

    //Constructor to initialize bike details
    public Bikes(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance ;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass: Auto
class Auto extends Vehicles implements GPS {
    private String currentLocation;

    //Constructor to initialize Auto details
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance ;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Main Class
public class RideHailingApplication {
    public static void processRides(List<Vehicles> vehicles, double distance) {
        for (Vehicles vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: " + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Vehicle reference contains subclass object
        Vehicles car = new Cars("C001", "Amar", 15, "Downtown");
        Vehicles bike = new Bikes("B001", "Akbar", 10, "Uptown");
        Vehicles auto = new Auto("A001", "Antony", 12, "City Center");

        //List for vehicle
        List<Vehicles> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // method for Calculate fare for 10 km
        processRides(vehicles, 10);
    }
}
