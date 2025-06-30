package filehandlingdemo.niodemo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

// C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/niodemo/SampleFiles/sample1.txt

public class NioPackage {

    // creating directory
    public static void createDirectory() {

        try {

            Path p = Paths.get("C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/niodemo/SampleFiles");

            if (Files.exists(p)) {
                System.out.println("Directory already Exists");
            } else {
                Path dirloc = Files.createDirectories(p);
                System.out.println(dirloc.toString());
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    // creating files
    public static void createFiles() {
        try {
            Path p = Paths.get("C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/niodemo/SampleFiles/sample1.txt");

            if (Files.exists(p)) {
                System.out.println("File exists: " + p.getFileName());
            } else {
                Path createdFile = Files.createFile(p);
                System.out.println("File is created: " + createdFile.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // write data into the file
    public static void writeDataAsBytes() {

        try {
            Path p = Paths.get("C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/niodemo/SampleFiles/sample2.txt");

            Path createdLocation = Files.createFile(p);

            String content = "Hello from the nio package write.";

            Files.write(createdLocation, content.getBytes());

            System.out.println("Data written on the file as bytes array");

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    // reading a file
    public static void readingFile() {

        try {
            Path p = Paths.get("C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/niodemo/SampleFiles/sample1.txt");

            List<String> dataLine = Files.readAllLines(p);

            dataLine.stream().forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        // Creating directory
        // createDirectory();

        // Creating file on desired location
        // createFiles();

        // Writing data on a file as byte array
        // writeDataAsBytes();

        // Reading a file
        // readingFile();

    }

}
