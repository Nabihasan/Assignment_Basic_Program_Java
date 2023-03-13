package FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) throws IOException {
        try {

            FileWriter fileWriter = new FileWriter("E:\\program core java\\FileWriter.txt");

            fileWriter.write('I');

            System.out.println("hello world");
            
            fileWriter.write("how are you doing.....");

            System.out.println("Write String");

            fileWriter.close();
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}