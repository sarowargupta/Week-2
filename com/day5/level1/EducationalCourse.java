package com.day5.level1;
class Course {
    //attribute
    private String courseName;
    // Duration in hours
    private int duration;

    // Constructor to initialize course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Getter
    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Details: ");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    //attribute
    private String platform;
    private boolean isRecorded;

    // Constructor to initialize online course details
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseDetails() {
        // Call superclass method
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    //attribute
    private double fee;
    // Discount in percentage
    private double discount;

    // Constructor to initialize Paid online course
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate final price after discount
    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        // Call superclass method
        super.displayCourseDetails();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + calculateFinalFee());
    }
}

public class EducationalCourse {
    public static void main(String[] args) {
        // Create a basic course
        Course basicCourse = new Course("Introduction to Java", 30);
        basicCourse.displayCourseDetails();
        System.out.println();

        // Create an online course
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 40, "Udemy", true);
        onlineCourse.displayCourseDetails();
        System.out.println();

        // Create a paid online course
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Mastering Java", 50, "Coursera", true, 200, 15);
        paidOnlineCourse.displayCourseDetails();
    }
}

