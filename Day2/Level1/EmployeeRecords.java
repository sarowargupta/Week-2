package Day2.Level1;
import java.util.*;
class Employee {
    // Instance Variables
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize Employee object
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get the salary
    public double getSalary() {
        return salary;
    }

    // Public method to set (modify) the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Manager class (Subclass of Employee)
class Manager extends Employee {

    // Constructor to initialize Manager object
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); // Call the constructor of the superclass (Employee)
    }

    // Method to access employeeID and department (from Employee class)
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        // Accessing public variable
        System.out.println("Employee ID: " + employeeID);
        // Accessing protected variable
        System.out.println("Department: " + department);
        // Accessing salary using getter method
        System.out.println("Salary: " + getSalary());
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee1 = new Employee(101, "HR", 50000.00);

        // Display employee details
        employee1.displayEmployeeDetails();

        // Modify the salary using the setter method
        System.out.print("Enter new salary for the employee: ");
        double newSalary = 55000.00;  // Here you could use Scanner for dynamic input if needed
        employee1.setSalary(newSalary);
        System.out.println("Updated Employee Details:");
        employee1.displayEmployeeDetails();

        System.out.println();

        // Create a Manager object
        Manager manager1 = new Manager(102, "IT", 70000.00);

        // Display manager details
        manager1.displayManagerDetails();
    }
}


