package Day3.Level1;
import java.util.*;
class Student{

    //instance variable
    private String name;
    private final double rollNumber;
    private String grade;

    //class variable share among all Student
    static String universityName = "University Of Technology";
    static int totalCount = 0;

    //constructor to initialize Student details
    public Student(String name,double rollNumber ,String grade){
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalCount++;
    }

    //method to count total number of student
    public static void displayTotalStudents(){
        System.out.println("Total Student: " + totalCount);
    }

    //method to display details of Student
    public void displayDetails(){
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("UnivesityName: " + universityName);
    }
}
public class UniversityStudentManagement {
    public static void main(String[] args) {
        //create an object for class Student
        Student student1 = new Student("Sarowar",101,"A");
        Student student2 = new Student("Gupta",102,"A");

        //check object is an instance of the class Student
        if(student1 instanceof Student){
            System.out.println("student1 is instance of class Student");
            student1.displayDetails();
        }
        if(student2 instanceof Student){
            System.out.println("student2 is instance of class Student");
            student2.displayDetails();
        }

        //total student
        Student.displayTotalStudents();
    }
}

