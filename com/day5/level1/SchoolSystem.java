package com.day5.level1;
class Person {
    //attribute
    private String name;
    private int age;

    // Constructor to initialize person details
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    //attribute
    private String subject;

    // Constructor to initialize teacher details
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    //attribute
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int age, String grade) {
        super(name, age); // Call to superclass constructor
        this.grade = grade;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Student");
    }

    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    //attribute
    private String department;

    // Constructor to initialize staff details
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Method to display the role
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    @Override
    public void displayDetails() {
        // Call superclass method
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        // Create a Student
        Student student = new Student("Bob", 16, "10th Grade");
        student.displayRole();
        student.displayDetails();
        System.out.println();

        // Create a Staff member
        Staff staff = new Staff("Charlie", 40, "Administration");
        staff.displayRole();
        staff.displayDetails();
    }
}

