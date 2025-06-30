package filehandlingdemo.bytestreams;

import java.io.FileInputStream;
import java.io.IOException;

class BytestreamsReadDemo {
    public static void main(String[] args) {

        // Reading a file using the FileInputStream

        try (FileInputStream fis = new FileInputStream(
                "C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/bytestreams/sample.txt")) {

            int i;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            // fis.close() -- since we using try-with-resource it will automatically closed

        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
