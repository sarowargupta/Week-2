package com.day5.level1;
class Person1 {
    //attribute
    private String name;
    private int id;

    // Constructor to initialize person details
    public Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {
    void performDuties();
}

class Chef extends Person1 implements Worker {
    //attribute
    private String specialty;

    // Constructor to initialize chefs details
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement performDuties method
    @Override
    public void performDuties() {
        System.out.println("Duties: Cooking and preparing dishes. Specialty: " + specialty);
    }


    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}

class Waiter extends Person1 implements Worker {
    //attribute
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Serving customers in section: " + section);
    }

    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Section: " + section);
    }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create a Chef
        Chef chef = new Chef("Alice", 101, "Indoor Section");
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        // Create a Waiter
        Waiter waiter = new Waiter("Bob", 202, "Outdoor Section");
        System.out.println("Waiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}

