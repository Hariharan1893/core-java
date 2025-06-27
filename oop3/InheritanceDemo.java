package oop3;

// Single Inheritance
class Animal {
    public String color;

    Animal(String color) {
        this.color = color;
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public String breed;

    Dog(String color, String breed) {
        super(color);
        this.breed = breed;
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Multilevel Inheritance

class Puppy extends Dog {
    public String size;

    Puppy(String color, String breed, String size) {
        super(color, breed);
        this.size = size;
    }

    void play() {
        System.out.println("Puppy is playing");
    }
}

// Heirarchical Inheritance

class Vehicle {
    public String engine;

    Vehicle(String engine) {
        this.engine = engine;
    }

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    public String model;

    Car(String engine, String model) {
        super(engine);
        this.model = model;
    }

    void drive() {
        System.out.println("Car is driving");
    }

}

class Bike extends Vehicle {
    public String type;

    Bike(String engine, String type) {
        super(engine);
        this.type = type;
    }

    void ride() {
        System.out.println("Bike is riding");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        // Single Inheritance Example
        System.out.println("Single Inheritance Example:");
        Dog dog1 = new Dog("Brown", "Labrador");
        Animal animal1 = new Dog("Black", "German Shepherd");

        System.out.println("Dog Color: " + dog1.color);
        System.out.println("Dog Breed: " + dog1.breed);
        dog1.eat();
        dog1.bark();

        System.out.println("Animal Color: " + animal1.color);
        animal1.eat();
        // animal1.bark(); // This line would cause a compile-time error because 'bark'
        // is not defined in Animal class
        // animal1.breed; // This line would also cause a compile-time error because
        // 'breed' is not defined in Animal class

        // Multilevel Inheritance Example
        System.out.println("\nMultilevel Inheritance Example:");

        Puppy puppy1 = new Puppy("white", "pug", "small");
        System.out.println("Puppy Color: " + puppy1.color);
        System.out.println("Puppy Breed: " + puppy1.breed);
        System.out.println("Puppy Size: " + puppy1.size);
        puppy1.eat();
        puppy1.bark();
        puppy1.play();

        // Heirarchical Inheritance Example
        System.out.println("\nHeirarchical Inheritance Example:");
        Car car1 = new Car("V8", "Mustang");
        Bike bike1 = new Bike("V2", "Sport");

        System.out.println("Car Engine: " + car1.engine);
        System.out.println("Car Model: " + car1.model);
        car1.start();
        car1.drive();

        System.out.println("Bike Engine: " + bike1.engine);
        System.out.println("Bike Type: " + bike1.type);
        bike1.start();
        bike1.ride();

    }

}
