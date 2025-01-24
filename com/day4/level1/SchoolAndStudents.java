import java.util.ArrayList;
import java.util.List;

class School {
    private String name;
    private List<Student> students;

    // Constructor
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to list all students
    public void listStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getName() {
        return name;
    }
}
class Student {
    private String name;
    private List<Course> courses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in course: " + course.getName());
    }

    // Method to list courses
    public void listCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}
class Course {
    private String name;
    private List<Student> students;

    // Constructor
    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to list enrolled students
    public void listStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getName() {
        return name;
    }
}

public class SchoolAndStudents {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenwood High");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add students to the school
        school.addStudent(alice);
        school.addStudent(bob);

        // Create courses
        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");

        // Enroll students in courses
        alice.enrollCourse(math);
        alice.enrollCourse(physics);
        bob.enrollCourse(physics);

        // List all students in the school
        school.listStudents();

        // List enrolled students in each course
        math.listStudents();
        physics.listStudents();

        // List courses for each student
        alice.listCourses();
        bob.listCourses();
    }
}

