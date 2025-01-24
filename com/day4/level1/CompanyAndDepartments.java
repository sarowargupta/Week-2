import java.util.ArrayList;
import java.util.List;
class Employee {
    //attribute
    private String employeeName;
    private String position;

    // Constructor to initialize employee details
    public Employee(String employeeName, String position) {
        this.employeeName = employeeName;
        this.position = position;
    }

    // Getters
    public String getName() {
        return employeeName;
    }

    public String getPosition() {
        return position;
    }
}


class Department {
    //attribute
    private String depatmentName;
    private List<Employee> employees;

    // Constructor to initialize department details
    public Department(String depatmentName) {
        this.depatmentName = depatmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee
    public void addEmployee(String name, String position) {
        Employee newEmployee = new Employee(name, position);
        employees.add(newEmployee);
    }

    // Method to list all employees
    public void listEmployees() {
        System.out.println("Employees in Department: " + depatmentName);
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + ", Position: " + employee.getPosition());
        }
    }

    public String getName() {
        return depatmentName;
    }
}

class Company {
    //attribute
    private String name;
    private List<Department> departments;

    // Constructor to initialize company details
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(String departmentName) {
        Department newDepartment = new Department(departmentName);
        departments.add(newDepartment);
    }

    // Method to add an employee to a specific department
    public void addEmployeeToDepartment(String departmentName, String employeeName, String position) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addEmployee(employeeName, position);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found.");
    }

    // Method to list all departments and their employees
    public void listDepartmentsAndEmployees() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.listEmployees();
        }
    }
}

public class CompanyAndDepartments{
    public static void main(String[] args) {
        // Create a company object
        Company company = new Company("TechnoGroup");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees to departments
        company.addEmployeeToDepartment("IT", "Alice", "Software Engineer");
        company.addEmployeeToDepartment("IT", "Bob", "System Analyst");
        company.addEmployeeToDepartment("HR", "Charlie", "Recruiter");

        // List all departments and their employees
        company.listDepartmentsAndEmployees();
    }
}
