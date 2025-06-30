package filehandlingdemo.serializationdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/serializationdemo/sample.txt

class Employee implements Serializable {
    private int id;
    private String name;

    // the transient keyword exclude the feild from the serialization
    private transient long salary;

    Employee(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

}

public class ObjectStreamReader {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Hari", 10000000);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
                "C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/serializationdemo/sample.txt"))) {

            oos.writeObject(emp1);
            // oos.close() -- automatically closed since we are using the try-with-resource

            System.out.println("Object serialized into sample.txt");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
