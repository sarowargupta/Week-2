package Day2.Level1;
import java.util.*;
// Student class
class Student {
    // Instance Variables
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor to initialize Student object
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA! CGPA must be between 0 and 10.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// PostgraduateStudent class (Subclass of Student)
class PostgraduateStudent extends Student {

    // Constructor to initialize PostgraduateStudent object
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        // Call the constructor of the superclass (Student)
        super(rollNumber, name, CGPA);
    }

    // Method to access and modify the protected variable 'name'
    public void changeName(String newName) {
        name = newName;
    }

    // Method to display postgraduate student details
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails(); // Calling the parent class method
        System.out.println("This is a postgraduate student.");
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating Student object
        Student student1 = new Student(101, "Alice", 8.7);
        student1.displayStudentDetails();

        // Modifying CGPA using public methods
        student1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        System.out.println();

        // Creating PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 9.5);
        pgStudent.displayStudentDetails();

        // Accessing and modifying the protected 'name' using the subclass method
        pgStudent.changeName("Robert");
        System.out.println("Updated Name: " + pgStudent.name);
    }
}

