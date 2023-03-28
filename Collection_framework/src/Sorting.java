import java.util.ArrayList;
import java.util.TreeSet;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hasan raza");
        list.add("Aamir ali");
        list.add("Habib khan");
        list.add("Habib");
        list.add("ABC");

        TreeSet<String> set = new TreeSet<>();

        set.addAll(list);

        set.forEach(str ->{
            System.out.println("sorting :"+str);
        });
    }
}