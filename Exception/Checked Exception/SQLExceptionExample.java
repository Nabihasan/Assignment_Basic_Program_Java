
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver load successfully");
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data5","root","1234");
			System.out.println("connection established");
	
			con.close();
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			System.out.println(e);
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
