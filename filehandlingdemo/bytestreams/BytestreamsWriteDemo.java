package filehandlingdemo.bytestreams;

import java.io.FileOutputStream;
import java.io.IOException;

public class BytestreamsWriteDemo {

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream(
                "C:/Users/harih/OneDrive/Desktop/java/filehandlingdemo/bytestreams/sample.txt", true)) {

            String data = "\nData written from the FileOutputStream for the next time";

            fos.write(data.getBytes());

            // fos.close() -- its optional since we using try-with-resource

            System.out.println("Data is writter successfully..");
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
