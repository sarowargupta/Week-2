package com.day5.level1;
class Employee{

    //attribute
    private String name;
    private String employeeID;
    private double salary;

    // constructor to initialize employee details
    public Employee(String name,String employeeID, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getEmployeeID(){
        return employeeID;
    }
    public double getSalary(){
        return salary;
    }

    //method to display details of employees
    public void displayDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }

}
class Manager extends Employee{
    //unique attribute
    private int teamSize;

    //constructor to initialize Manager details
    Manager(String name,String ID,double salary,int teamSize){
        super(name,ID,salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails(){
        System.out.println("Manager Details: ");
        System.out.println("Manager Name: " + getName());
        System.out.println("ManagerID: "+ getEmployeeID());
        System.out.println("Salary of Manager: " + getSalary());
        System.out.println("TeamSize: " + teamSize);
    }


}
class Developer extends Employee{
    //unique attribute
    private String programmingLanguage;

    //constructor to initialize Developer details
    Developer(String name,String ID,double salary,String programmingLanguage){
        super(name,ID,salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails(){
        System.out.println("Developer Details: ");
        System.out.println("Developer Name: " + getName());
        System.out.println("DeveloperID: "+ getEmployeeID());
        System.out.println("Salary of Developer: " + getSalary());
        System.out.println("ProgrammingLanguage: " + programmingLanguage);
    }

}
class Intern extends Employee{
    //Unique attribute internship period
    private int period;

    //constructor to initialize Intern details
    Intern(String name,String ID,double salary,int period){
        super(name,ID,period);
        this.period = period;
    }

    @Override
    public void displayDetails(){
        System.out.println("Intern Details: ");
        System.out.println("Intern Name: " + getName());
        System.out.println("InternID: "+ getEmployeeID());
        System.out.println("Salary of Intern: " + getSalary());
        System.out.println("Internship period in year: " + period);
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //Employee reference contains Manager object
        Employee manager = new Manager("Sarowar", "101A", 2000000, 10);
        manager.displayDetails();

        //Employee reference contains Developer object
        Employee developer = new Developer("Sarowar Gupta","1000A",1100000,"Java");
        developer.displayDetails();

        //Employee reference contains Intern object
        Employee intern = new Intern("Alice", "1010A", 700000, 2);
        intern.displayDetails();

    }

}