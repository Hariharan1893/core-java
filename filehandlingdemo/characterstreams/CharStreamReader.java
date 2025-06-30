package filehandlingdemo.characterstreams;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamReader {

    public static void main(String[] args) {

        try (FileReader fr = new FileReader(
                "C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/characterstreams/sample.txt")) {

            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);

                // fr.close() -- it is option

            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
