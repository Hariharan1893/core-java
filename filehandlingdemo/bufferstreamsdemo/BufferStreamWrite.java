package filehandlingdemo.bufferstreamsdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamWrite {

    public static void main(String[] args) {

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/bufferstreamsdemo/sample.txt", true))) {
            String data = "\nData written using the buffer stream in java";

            writer.write(data);

            writer.newLine();

            writer.write("New line..");

            System.out.println("Data written succesfully..");

            // writer.close is optional
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
