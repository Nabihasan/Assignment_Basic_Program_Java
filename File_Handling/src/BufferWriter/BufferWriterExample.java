package BufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterExample {

    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("file\\BufferedWriter.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Welcome everyone");
            bufferedWriter.newLine();
            bufferedWriter.write("How are you doing?");
            System.out.println("operation Successfull...........");
            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}