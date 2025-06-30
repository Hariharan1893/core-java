package filehandlingdemo.characterstreams;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWriter {

    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter(
                "C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/characterstreams/sample.txt", true)) {

            String data = "\nData writter using the FileWriter";

            fw.write(data);

            System.out.println("Characters are writter..");

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
