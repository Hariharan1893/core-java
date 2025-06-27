package comparablevscomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student otStudent) {
        // compare by id
        // if id value is large and of type nt it can cause overflow
        // return this.id - otStudent.getId();

        return Integer.compare(this.id, otStudent.getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}

class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

public class ComparableVsComparatorDemo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(102, "Hari"));
        list.add(new Student(101, "Ram"));
        list.add(new Student(103, "Shyam"));

        Collections.sort(list);

        System.out.println("Sorted by ID using Comparable:");
        System.out.println(list);

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(102, "Hari"));
        empList.add(new Employee(101, "Valar"));
        empList.add(new Employee(103, "Dhivya"));

        // Using Comparator to sort Employee by Name

        Collections.sort(empList, new SortById());
        System.out.println("Sorted by Id using Comparator:" + empList);

        // Collections.sort(empList, new SortByName());

        empList.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by Name using Comparator:" + empList);

    }
}
