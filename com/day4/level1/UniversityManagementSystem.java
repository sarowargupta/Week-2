import java.util.ArrayList;
import java.util.List;

class STudent {
    private String name;
    private List<COurse> courses;

    // Constructor to initialize student details
    public STudent(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(COurse course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in course: " + course.getName());
    }

    // Method to list courses
    public void listCourses() {
        System.out.println("Courses for " + name + ":");
        for (COurse course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Professor {
    private String name;
    private List<COurse> courses;

    // Constructor to initialize professor details
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to assign a course
    public void assignCourse(COurse course) {
        courses.add(course);
        course.setProfessor(this);
        System.out.println(name + " assigned to course: " + course.getName());
    }

    // Method to list courses
    public void listCourses() {
        System.out.println("Courses taught by " + name + ":");
        for (COurse course : courses) {
            System.out.println("- " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class COurse {
    private String name;
    private Professor professor;
    private List<STudent> students;

    // Constructor to initialize course details
    public COurse(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(STudent student) {
        students.add(student);
    }

    // Method to set the professor
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to list enrolled students
    public void listStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (STudent student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args) {
        // Create students
        STudent student1 = new STudent("Alice");
        STudent student2 = new STudent("Bob");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Jones");

        // Create courses
        COurse math = new COurse("Mathematics");
        COurse physics = new COurse("Physics");

        // Assign professors to courses
        professor1.assignCourse(math);
        professor2.assignCourse(physics);

        // Enroll students in courses
        student1.enrollCourse(math);
        student1.enrollCourse(physics);
        student2.enrollCourse(physics);

        // List courses and their details
        math.listStudents();
        physics.listStudents();

        // List courses for students and professors
        student1.listCourses();
        student2.listCourses();
        professor1.listCourses();
        professor2.listCourses();
    }
}

