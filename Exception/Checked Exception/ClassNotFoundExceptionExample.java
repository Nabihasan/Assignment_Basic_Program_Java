import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
	
public class ClassNotFoundExceptionExample {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver load successfully");
		
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
			
		
	}

	}
}