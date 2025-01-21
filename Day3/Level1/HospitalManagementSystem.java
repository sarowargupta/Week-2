package Day3.Level1;
import java.util.*;
class Patient{

    //instance variable
    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    //class variable share among all Patients
    static String hospitalName = "City Hospital";
    static int totalCount = 0;

    //constructor to initialize patient details
    public Patient(String patientID,String name,int age ,String ailment){
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalCount++;
    }

    //method to count total number of patient
    public static void getTotalPatients(){
        System.out.println("Total Student: " + totalCount);
    }

    //method to display details of patient
    public void displayDetails(){
        System.out.println("Patient Details");
        System.out.println("PatientID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("ailment: " + ailment);
        System.out.println("HospitalName: " + hospitalName);
    }
}
public class HospitalManagementSystem{
    public static void main(String[] args) {
        //create an object for class patient
        Patient patient1 = new Patient("P001","ABCD",16,"Fever");
        Patient patient2 = new Patient("P002","EFGH",20,"Cough");

        //check object is an instance of the class Patient
        if(patient1 instanceof Patient){
            System.out.println("patient1 is instance of class Patient");
            patient1.displayDetails();
        }
        if(patient2 instanceof Patient){
            System.out.println("patient2 is instance of class patient");
            patient2.displayDetails();
        }

        //total patient
        Patient.getTotalPatients();
    }
}

