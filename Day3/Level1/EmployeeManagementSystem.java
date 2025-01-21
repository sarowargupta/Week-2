package Day3.Level1;
import java.util.*;
class Employee{

    //instance variable
    private String name;
    private final String ID;
    private String designation;

    //class variable share among all employee
    static String companyName = "ABCDE";
    static int totalCount = 0;

    //constructor to initialize employee details
    public Employee(String name,String ID,String designation){
        this.name = name;
        this.ID = ID;
        this.designation = designation;
        totalCount++;
    }

    //method to count total number of employee
    public static void displayTotalEmployees(){
        System.out.println("Total Employee: " + totalCount);
    }

    //method to display details of employee
    public void displayDetails(){
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Designation: " + designation);
        System.out.println("Company Name: " + companyName);
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //create a object for class employee
        Employee employee1 = new Employee("Sarowar","101","Software Engineer");
        Employee employee2 = new Employee("Gupta","102","Senior Software Engineer");

        //check object is an instance of the class employee
        if(employee1 instanceof Employee){
            System.out.println("employee1 is instance of class employee");
            employee1.displayDetails();
        }
        if(employee2 instanceof Employee){
            System.out.println("employee2 is instance of class employee");
            employee2.displayDetails();
        }

        //total employee
        Employee.displayTotalEmployees();
    }
}
