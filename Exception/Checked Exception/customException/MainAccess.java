package customException;

public class MainAccess {

	
		public static void main(String args[])
	    {
	        try {
	            
	            throw new UserException("This is my exception");
	        }
	        catch (UserException e) {
	            System.out.println("kindly Caughtthis exception");
	 
	           // System.out.println(ex.getMessage());
	        }
	    }
	

}
