package com.day5.level1;
class Vehicle{

    //attribute
    //speed in km/hr
    private double maxSpeed;
    private String fuelType;

    // constructor to initialize Vehicle details
    public Vehicle(double maxSpeed,String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType= fuelType;
    }

    //getters
    public double getSpeed(){
        return maxSpeed;
    }
    public String getFuelType(){
        return fuelType;
    }

    //method to display details of Vehicle
    public void displayInfo(){
        System.out.println("Vehicle Details: ");
        System.out.println("Speed of vehicle in km/hr: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);

    }

}
class Car extends Vehicle{
    //unique attribute
    private int seatCapacity;

    //constructor to initialize Car details
    Car(double maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    public void displayInfo(){
        System.out.println("Details of Car: ");
        System.out.println("Speed of car in km/hr: " + getSpeed());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("SeatCapacity in car: " + seatCapacity);
    }


}
class Truck extends Vehicle{
    //unique attribute
    //weight in kg
    private float weight;

    //constructor to initialize Truck details
    Truck(double maxSpeed,String fuelType,float weight){
        super(maxSpeed,fuelType);
        this.weight = weight;
    }

    @Override
    public void displayInfo(){
        System.out.println("Details of Truck: ");
        System.out.println("Speed of Truck in km/hr: " + getSpeed());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Weight of truck: " + weight + " kg ");
    }

}
class Motorcycle extends Vehicle{
    //Unique attribute
    private int wheels;

    //constructor to initialize Motorcycle details
    Motorcycle(double maxSpeed,String fuelType,int wheels){
        super(maxSpeed,fuelType);
        this.wheels = wheels;
    }

    @Override
    public void displayInfo() {
        System.out.println("Details of Motorcycle: ");
        System.out.println("Speed of Motorcycle in km/hr: " + getSpeed());
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Number of wheels in motorcycle: " + wheels);
    }

}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        //creating an array of vehicle type
        Vehicle[] vehicles = new Vehicle[3];

        //Vehicle reference contains Car,Truck and motorcycle object
        vehicles[0] = new  Car(40, "CNG", 4);
        vehicles[1] = new  Truck(50, "Diesel", 200);
        vehicles[2] = new  Motorcycle(30, "Petrol", 2);

       //displaying the details of each
        for(Vehicle vehicle:vehicles){
            vehicle.displayInfo();
        }

    }
}


