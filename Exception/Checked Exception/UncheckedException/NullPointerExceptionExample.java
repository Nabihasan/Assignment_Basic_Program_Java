package UncheckedException;

public class NullPointerExceptionExample {

	
			public static void main(String[] gg) {
				try {
					String s = null;
			        System.out.println(s.length());
				}catch(NullPointerException e) {
					System.out.println("NullPointerException"+e);
				}
	        
	    }

	}