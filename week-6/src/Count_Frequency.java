import java.util.HashMap;
import java.util.Map;

public class Count_Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2};

        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

        for (int digit : arr) {
            freqMap.put(digit, freqMap.getOrDefault(digit, 0) + 1);
        }

        for (int digit : freqMap.keySet()) {
            System.out.println(digit + " = " + freqMap.get(digit));
        }
    }
}
