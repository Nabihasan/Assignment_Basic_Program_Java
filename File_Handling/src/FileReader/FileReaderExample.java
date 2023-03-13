package FileReader;

import java.io.FileReader;

public class FileReaderExample{

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("E:\\program core java\\fileWriter.txt");

            int data = fileReader.read();
            
            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }
            
            System.out.println("");
            fileReader.close();
        } catch (Exception e) {
        }
    }
}