package UncheckedException;

public class ArrayIndexOutOfBoundException {
	
		public static void main(String[] agg) {
        int arr[] = new int[20];
        try {
            System.out.println(arr[32]);
        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("array index"+e);
        }
    }
}