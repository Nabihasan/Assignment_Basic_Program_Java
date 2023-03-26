import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unique_Element_Array {
    public static void main(String[] args) {
    	
    	
        int[] array = {1, 2, 3, 1, 2, 3, 3, 3, 3};
        Set<Integer> set = new HashSet<Integer>();

        for (int i : array) {
            set.add(i);
        }

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Unique elements: " + set);
    }
}
