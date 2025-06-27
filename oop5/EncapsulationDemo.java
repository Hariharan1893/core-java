package oop5;

// Encapsulation example class contains getters and setters with conditional setters also
class Employee {

    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("age should be greater than 18");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

// Encapsulation example class for read only class

class SalaryDetails {

    private long salary;

    SalaryDetails() {
        this.salary = 1500000;
    }

    public long getSalary() {
        return salary;
    }

}

public class EncapsulationDemo {

    public static void main(String[] args) {

        // Encapsulation demo for read and write using the getters and setters

        Employee emp1 = new Employee();

        emp1.setId(101);
        emp1.setAge(21);
        emp1.setName("Hari");

        System.out.println("id: " + emp1.getId());
        System.out.println("age: " + emp1.getAge());
        System.out.println("name: " + emp1.getName());

        Employee emp2 = new Employee();

        try {
            emp2.setAge(13); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("wrong age set: " + emp2.getAge());

        // Encapsulation demo for read only getters

        SalaryDetails sal = new SalaryDetails();

        System.out.println("Salary: " + sal.getSalary());

    }

}
