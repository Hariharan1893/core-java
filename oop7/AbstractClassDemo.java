package oop7;

// Abstract class
abstract class Parent {

    String name;

    Parent(String name) {
        this.name = name;
    }

    abstract String display(String name);
}

// Son class
class Son extends Parent {
    Son(String name) {
        super(name);
    }

    @Override
    String display(String name) {
        if (name != null && !name.isEmpty()) {
            return "Son's name is: " + name;
        }
        return "Name is not provided";
    }

}

// Daughter class
class Daughter extends Parent {
    Daughter(String name) {
        super(name);
    }

    @Override
    String display(String name) {
        if (name != null && !name.isEmpty()) {
            return "Daughter's name is: " + name;
        }
        return "Name is not provided";
    }

}

public class AbstractClassDemo {

    public static void main(String[] args) {
        Parent son = new Son("John");
        Parent daughter = new Daughter("Jane");

        System.out.println(son.display(son.name));
        System.out.println(daughter.display(daughter.name));
    }
}
