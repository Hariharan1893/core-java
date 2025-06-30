package filehandlingdemo.serializationdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

// C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/serializationdemo/sample.txt

public class ObjectStreamWriter {

    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                "C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/serializationdemo/sample.txt"))) {

            Employee emp2 = (Employee) ois.readObject();

            System.out.println("De-serialized: id: " + emp2.getId() + " name: " + emp2.getName());
            // since the salary field was set transient it will show 0 - default value for
            // long

            System.out.println("Value for the transient field - Salary: " + emp2.getSalary());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
