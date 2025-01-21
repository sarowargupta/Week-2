package Day2.Level1;
import java.util.*;
class Course {
    // Instance Variables
    private String courseName;

    // Duration in months
    private int duration;

    // Fee for the course
    private double fee;

    // Class Variable (shared among all courses)
    static String instituteName = "Online Academy";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class Method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class OnlineCourseManagement {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Input details for the first course
        System.out.println("Enter Course 1 Name: ");
        String courseName1 = sc.nextLine();
        System.out.println("Enter Course 1 Duration (in months): ");
        int duration1 = sc.nextInt();
        System.out.println("Enter Course 1 Fee: ");
        double fee1 = sc.nextDouble();
        sc.nextLine();

        // Create the first course object
        Course course1 = new Course(courseName1, duration1, fee1);

        // Input details for the second course
        System.out.println("Enter Course 2 Name: ");
        String courseName2 = sc.nextLine();
        System.out.println("Enter Course 2 Duration (in months): ");
        int duration2 = sc.nextInt();
        System.out.println("Enter Course 2 Fee: ");
        double fee2 = sc.nextDouble();
        sc.nextLine(); // Consume the newline left by nextDouble()

        // Create the second course object
        Course course2 = new Course(courseName2, duration2, fee2);

        // Display course details before updating institute name
        System.out.println("\nBefore Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Update the institute name for all courses
        System.out.println("Enter new Institute Name: ");
        String newInstituteName = sc.nextLine();
        Course.updateInstituteName(newInstituteName);

        // Display course details after updating institute name
        System.out.println("\nAfter Updating Institute Name:");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Close the scanner
        sc.close();
    }
}

