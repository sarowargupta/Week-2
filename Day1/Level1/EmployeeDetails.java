package Day1.Level1;
import java.util.*;
class Employee{
    private String name;
    private int id;
    private double salary;

    //Constructor
    Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display
    public void displayDetails(){
        System.out.println("Name: " + name + " ID: " + id + " Salary: " + salary);
    }



}
public class EmployeeDetails{
    public static void main(String[] args){
        //create a scanner object
        Scanner sc = new Scanner(System.in);

        //Enter name,id and salary of employeee
        System.out.println("Enter name of employee");
        String name = sc.nextLine();
        System.out.println("Enter id of employee");
        int id = sc.nextInt();
        System.out.println("Enter salary of employee");
        double salary = sc.nextDouble();

        //create a object of class
        Employee employee = new Employee(name,id,salary);

        //display the details
        employee.displayDetails();

        //close scanner
        sc.close();

    }
}


