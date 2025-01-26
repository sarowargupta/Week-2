package com.day5.level1;
class Animal{

    //attribute
    private String name;
    private int age;

    // constructor to initialize animal details
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    //getters
   public String getName(){
       return name;
    }
    public int getAge(){
        return age;
    }

    // method of make sound
    public void makeSound(){
        System.out.println("Animal make sound");
    }

    //method to display details of animal
    public void displayDetails(){
        System.out.println("Name" + name);
        System.out.println("Age" + age);
    }

}
class Dog extends Animal{
    //unique behaviour
    private  String breed;

    //constructor to initialize dog details
    Dog(String name,int age,String breed){
        super(name,age);
        this.breed = breed;
    }
    @Override
    public void makeSound(){
        System.out.println("Dog barks");
    }
    @Override
    public void displayDetails(){
        System.out.println("Dog details");
        System.out.println("Name of dog is " + getName());
        System.out.println("Age of dog is " + getAge());
        System.out.println("Breed of dog is " + breed);
    }

}
class Cat  extends Animal{
    //unique behaviour
    private String food;

    //constructor to initialize cat details
    Cat(String name,int age,String food){
        super(name,age);
        this.food = food;
    }
    @Override
    public void makeSound(){
        System.out.println("Cat meows");
    }
    @Override
    public void displayDetails(){
        System.out.println("Cat details");
        System.out.println("Name of cat is " + getName());
        System.out.println("Age of cat is " + getAge());
        System.out.println("Food of cat is " + food);
    }

}
class Bird extends Animal{
    //Unique behaviour
   private String Wing;

    //constructor to initialize birds details
    Bird(String name,int age,String Wing){
        super(name,age);
        this.Wing = Wing;
    }
    @Override
    public void makeSound(){
        System.out.println("Birds makes sweet sound");
    }
    @Override
    public void displayDetails(){
        System.out.println("Bird details");
        System.out.println("Name of bird is " + getName());
        System.out.println("Age of bird is " + getAge());
        System.out.println("Wing of bird is " + Wing);
    }

}

public class AnimalHierarchy {
    public static void main(String[] args) {
      //animal reference contains dog object
      Animal dog = new Dog("Puppy",6,"German Safford");
      dog.displayDetails();
      dog.makeSound();

      //animal reference contains cat object
      Animal cat = new Cat("Kitty",5,"Milk");
      cat.displayDetails();
      cat.makeSound();

      //Animal reference contains bird object
      Animal bird = new Bird("Sparrow",1,"Two Wings");
      bird.displayDetails();
      bird.makeSound();

    }
}