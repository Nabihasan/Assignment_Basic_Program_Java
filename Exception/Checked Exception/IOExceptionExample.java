import java.io.File;
import java.io.IOException;
public class IOExceptionExample {

	public static void main(String[] args) {
		
		
		File f=new File("E:\\program core java\\myfile.txt");
		
		try {
			boolean result=f.createNewFile();
			if(result) {
				System.out.println("operation successfull......");
			}else {
				System.out.println("operation unsuccessfull......");

			}
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("IO exception");
		}
			
	}

}
