package UncheckedException;

public class ArithmeticExceptionExample {

    public static void main(String[] gg) {
    	
    	
        try {
            System.out.println(32 / 0);
            
            
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}
