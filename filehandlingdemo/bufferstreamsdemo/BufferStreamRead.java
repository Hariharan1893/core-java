package filehandlingdemo.bufferstreamsdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferStreamRead {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/bufferstreamsdemo/sample.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.print(line);
                // reader.close() -- optional
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
