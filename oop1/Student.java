package oop1;

class Student {

    // Fields
    String name;
    int age;

    // final variable
    final String collegeName = "mvit";

    // Default Constructor
    Student() {
        System.out.println("Default Constructor called");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor called");
    }

    // Copy Constructor
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        System.out.println("Copy Constructor called");
    }

    

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name + " Age: " + age + " College Name: " + collegeName);
    }

    public static void main(String[] args) {

        // Default Constructor
        Student student1 = new Student();
        student1.name = "Hari";
        student1.age = 22;
        student1.displayDetails();

        // Parameterized Constructor
        Student student2 = new Student("Atch", 20);
        student2.displayDetails();

        // Copy Constructor
        Student student3 = new Student(student1);
        student3.displayDetails();

        // Attempting to change final variable (will cause an error)
        // student1.collegeName = "New College"; // Uncommenting this line will cause a
        // compilation error

        // Displaying final variable
        System.out.println("College Name: " + student1.collegeName);

        // Displaying final variable from another instance
        System.out.println("College Name from student2: " + student2.collegeName);

        // Displaying final variable from copy instance
        System.out.println("College Name from student3: " + student3.collegeName);

        // Note: The final variable 'collegeName' cannot be changed after
        // initialization,

        // so the following line would cause a compilation error if uncommented:

        // student1.collegeName = "New College"; // Uncommenting this line will cause a
        // compilation error

    }
}