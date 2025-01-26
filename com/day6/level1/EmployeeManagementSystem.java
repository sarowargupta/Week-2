package com.day6.level1;
//abstract employee class
abstract class Employee{
    private String employeeId;
    private String name;
    private double baseSalary;

    //Constructor to initialize employee details
    Employee(String employeeId,String name,double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //getter and setter
    public String getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    //abstract method
    abstract double calculateSalary();

    //concrete method to display details
    public void displayDetails(){
        System.out.println("Employee Details: ");
        System.out.println("EmployeeID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);

    }

}
//interface Department
interface Department{
    void assignDepartment(String department);
   String getDepartmentDetails();
}

//subclass full time employee
class FullTimeEmployee extends Employee implements Department{
    private String department;
    private double fixedSalary;

    //constructor to initialize full time employee details
    FullTimeEmployee(String employeeId,String name,double baseSalary,double fixedSalary){
        super(employeeId,name,baseSalary);
        this.fixedSalary = fixedSalary;

    }
    //getter ans setter
    public double getFixedSalary(){
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary){
        this.fixedSalary = fixedSalary;
    }

    @Override
    public void assignDepartment(String department){
        this.department =department;
        
    }
    @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + fixedSalary;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Fixed Salary: " + fixedSalary);
        System.out.println(getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }

}

//subclass part-time employee
class PartTimeEmployee extends Employee implements Department{
    private String department;
    private double hourlyRate;
    private int workHour;

    //Constructor to initialize part-time employee details
    PartTimeEmployee(String employeeId,String name,double baseSalary,double hourlyRate,int workHour){
        super(employeeId,name,baseSalary);
        this.hourlyRate = hourlyRate;
        this.workHour = workHour;
    }

    //getter and setter
    public double getHourlyRate(){
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public int getWorkHour(){
        return workHour;
    }
    public void setWorkHour(){
        this.workHour = workHour;
    }
    @Override
    public void assignDepartment(String department){
        this.department = department;
    }
    @Override
    public String getDepartmentDetails(){
        return "Department: " + department;
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary()+workHour*hourlyRate;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Work Hours: " + workHour);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println(getDepartmentDetails());
        System.out.println("Total Salary: " + calculateSalary());
    }

}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //class Employee reference contains subclass object
        Employee fullTimeEmployee = new FullTimeEmployee("1001A","Sarowar",5000000,5000000);
        Employee partTimeEmployee = new PartTimeEmployee("1022A","Alice",400000,200,4);

        //downcast to Department
        Department fullTimeDept = (FullTimeEmployee)fullTimeEmployee;
        fullTimeDept.assignDepartment("Senior Software Engineer");
        Department partTimeDept = (PartTimeEmployee)partTimeEmployee;
        partTimeDept.assignDepartment("IT");

        //display details
        System.out.println("full time employee details");
        fullTimeEmployee.displayDetails();
        fullTimeDept.getDepartmentDetails();
        System.out.println();

        System.out.println("part time employee details");
        partTimeEmployee.displayDetails();
        partTimeDept.getDepartmentDetails();
        System.out.println();

    }
}
