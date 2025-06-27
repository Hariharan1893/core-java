package oop4;

// Example of method overloading or compile time polymorphism in Java
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

// Example of method overloading or run time polymorphism in Java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        super.sound();
        System.out.println("Meow");
    }
}

public class PolymorphismDemo {

    // Compile time polymorphism example

    public static void demonOverloading() {

        Calculator calc = new Calculator();

        System.out.println("Integer addition: " + calc.add(5, 10));
        System.out.println("Double addition: " + calc.add(5.5, 10.5));
        System.out.println("String concatenation: " + calc.add("Hello, ", "World!"));
    }

    // Run time polymorphism example

    public static void demoOverriding() {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.sound(); // Outputs: Some sound
        System.out.println();
        dog.sound(); // Outputs: Bark
        System.out.println();
        cat.sound(); // Outputs: Meow
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating method overloading:");
        demonOverloading();

        System.out.println("\nDemonstrating method overriding:");
        demoOverriding();

    }
}
