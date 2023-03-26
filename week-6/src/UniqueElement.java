
import java.util.ArrayList;
import java.util.*;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        li.add(1);
        li.add(2);
        
      Set<Integer> set = new HashSet<Integer>(li);
       
        System.out.println(set);
    }
}
