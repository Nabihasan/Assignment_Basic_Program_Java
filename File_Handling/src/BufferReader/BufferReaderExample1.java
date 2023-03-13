package BufferReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderExample1 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("fs\\BufferedWriter.txt");
            BufferedReader br = new BufferedReader(fr);

            int data = br.read();
            while (data != -1) {
                System.out.print((char) data);
                data = br.read();
            }
            System.out.println("");
        } catch (Exception e) {
        	System.out.println(e);
        }
    }
}