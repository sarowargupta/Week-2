package Day1.Level2;
import java.util.*;
class Student{
    private String name;
    private int rollNumber;
    private double marks;

    // constructor
    public Student(String name,int rollNumber,double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }
    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

}
public class StudentReport {
    public static void main(String[] args){
        //create a sacnner object
        Scanner sc = new Scanner(System.in);

        //enter name,rollnumber and marks of the student
        System.out.println("Enter name of student:");
        String name = sc.nextLine();
        System.out.println("Enter roll number of student: ");
        int rollNumber = sc.nextInt();
        System.out.println("Enter the marks of student");
        double marks = sc.nextDouble();

        // create an object of Student class
        Student student = new Student(name,rollNumber,marks);

        //display details and grade of student
        student.displayDetails();

    }
}


