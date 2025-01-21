package Day2.Level1;
import java.util.*;
class Person{
    // attribute
    private String name;
    private int age;

    //default constructor
    public Person() {
        name = "ABCD";
        age = 23;
    }
    // copy connstructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    //display
    public void display() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


}

public class PersonDetails {
    public static void main(String[] args) {
        //creating person object using the default constructor
        Person person1 = new Person();
        person1.display();

        //creating a person object using the copy constuctor
        Person person2 = new Person(person1);
        person2.display();
    }
}
