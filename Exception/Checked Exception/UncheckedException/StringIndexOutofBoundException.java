package UncheckedException;

public class StringIndexOutofBoundException {
		public static void main(String[] args) {
			try {
				String s = "nabi hasan";

				System.out.println(s.charAt(1));
			}catch(StringIndexOutOfBoundsException e) {
				System.out.println("StringIndexOutOfBoundsException"+e);
			}
			
    }
}
