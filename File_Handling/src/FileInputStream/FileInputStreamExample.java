package FileInputStream;

import java.io.FileInputStream;

public class FileInputStreamExample {

    public static void main(String[] args) {
        try {
            FileInputStream fileReader = new FileInputStream("E:\\program core java\\files.txt");

            int data = fileReader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = fileReader.read();
            }

            System.out.println("");
            fileReader.close();
        } catch (Exception e) {
        	System.out.println(e);
        }
    }
}