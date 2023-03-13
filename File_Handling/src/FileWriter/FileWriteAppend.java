package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteAppend {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fileWriter = new FileWriter("E:\\program core java\\FileWriter.txt", true);
            fileWriter.write("\n Append");

            System.out.println("Write Sucessfully");

            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}