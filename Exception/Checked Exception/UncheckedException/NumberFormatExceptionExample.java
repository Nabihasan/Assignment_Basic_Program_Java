package UncheckedException;

public class NumberFormatExceptionExample {

    public static void main(String[] gg) {
    	try {
    		String s = "Nabi Hasan";
            int num = Integer.parseInt(s);
    	}catch(NumberFormatException e) {
    		System.out.println("NumberFormatException"+e);
    	}
    }
}