import java.util.HashSet;
import java.util.TreeSet;

public class Set_Collection {

    public static void main(String[] args) {
        //implement set by Hashset and TreeSet

        HashSet<Double>  set=new HashSet<>();
        set.add(123.4);
        set.add(234.45);//not index collection
        set.add(1123.4);//order not peserved
        set.add(13.14);
        set.add(3.14);
       // set.add(13.14); duplicate is not allowed
        System.out.println("set elements : "+set);

        //TreeSet
        TreeSet<Double> s=new TreeSet<>();
        s.addAll(set);
        System.out.println("Tree set elements : "+s);//sort by follow binary search tree
    }
}
