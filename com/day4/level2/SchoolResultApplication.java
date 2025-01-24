import java.util.*;
class Subject {
    //attribute
    private String name;
    private int marks;

    //constructor to initialize subject details
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

class Students{
    private String name;
    private List<Subject> subjects;

    //constructor to initialize student details
    public Students(String name, List<Subject> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    //getter
    public String getName() {
        return name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    //get total marks
    public int getTotalMarks() {
        int total = 0;
        for (Subject subject : subjects) {
            total += subject.getMarks();
        }
        return total;
    }
}

class GradeCalculator {

    //calculate grade
    public String calculateGrade(Students student) {
        int totalMarks = calculateTotalMarks(student);
        if (totalMarks >= 90) {
            return "A";
        } else if (totalMarks >= 80) {
            return "B";
        } else if (totalMarks >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    //,calculate totalMarks
    public int calculateTotalMarks(Students student) {
        return student.getTotalMarks();
    }
}


public class SchoolResultApplication {
    public static void main(String[] args) {
        // Creating subjects for the student
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Creating a student with the subjects
        Students john = new Students("John", Arrays.asList(maths, science));

        // Creating a GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculating the grade for the student
        String grade = gradeCalculator.calculateGrade(john);

        // Printing the result
        System.out.println("Student: " + john.getName());
        System.out.println("Subjects and Marks:");

        for (Subject subject : john.getSubjects()) {
            System.out.println(subject.getName() + ": " + subject.getMarks());
        }

        System.out.println("Total Marks: " + john.getTotalMarks());
        System.out.println("Grade: " + grade);
    }
}
