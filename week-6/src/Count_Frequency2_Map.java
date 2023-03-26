import java.util.HashMap;
import java.util.Map;

public class Count_Frequency2_Map {
    public static void main(String[] args) {
        String str = "believe in yourself";

        Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                c = Character.toLowerCase(c);
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        for (char c : freqMap.keySet()) {
            System.out.println(c + " = " + freqMap.get(c));
        }
    }
}

