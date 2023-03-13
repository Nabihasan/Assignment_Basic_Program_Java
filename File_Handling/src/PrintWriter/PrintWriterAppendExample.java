package PrintWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterAppendExample {

    public static void main(String[] args) {
        try {
            File f = new File("E:\\program core java\\PrintWriter.txt");
            PrintWriter printWriter = new PrintWriter(new FileWriter(f, true));
            
            printWriter.println("Append text");
            
            System.out.println("Append Successfully");
            printWriter.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
