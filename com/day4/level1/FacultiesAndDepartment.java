import java.util.ArrayList;
import java.util.List;
class Faculty {
    //attribute
    private String name;

    // Constructor to initialize faculty details
    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Depart {
    //attribute
    private String name;
    private List<Faculty> facultyMembers;

    // Constructor to initialize Department details
    public Depart(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    // Method to add a faculty member
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Method to list faculty members
    public void listFaculty() {
        System.out.println("Faculty in Department: " + name);
        for (Faculty faculty : facultyMembers) {
            System.out.println("Name: " + faculty.getName());
        }
    }

    public String getName() {
        return name;
    }
}


class University {
    private String name;
    private List<Depart> departments;

    // Constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(String departmentName) {
        Depart newDepartment = new Depart(departmentName);
        departments.add(newDepartment);
    }

    // Method to add a faculty member to a department
    public void addFacultyToDepartment(String departmentName, Faculty faculty) {
        for (Depart department : departments) {
            if (department.getName().equals(departmentName)) {
                department.addFaculty(faculty);
                return;
            }
        }
        System.out.println("Department " + departmentName + " not found.");
    }

    // Method to list all departments and their faculty
    public void listDepartmentsAndFaculty() {
        System.out.println("University: " + name);
        for (Depart department : departments) {
            department.listFaculty();
        }
    }

    public String getName() {
        return name;
    }
}


public class FacultiesAndDepartment {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Techno University");

        // Add departments
        university.addDepartment("Computer Science");
        university.addDepartment("Physics");

        // Create faculty members
        Faculty faculty1 = new Faculty("Prof. Alice");
        Faculty faculty2 = new Faculty("Prof. Bob");
        Faculty faculty3= new Faculty("Prof. Charlie");

        // Add faculty members to departments
        university.addFacultyToDepartment("Computer Science", faculty1);
        university.addFacultyToDepartment("Computer Science", faculty2);
        university.addFacultyToDepartment("Physics", faculty3);

        // List all departments and their faculty members
        university.listDepartmentsAndFaculty();
    }
}

