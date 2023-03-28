import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

//List interface implements by ArrayList and LinkedList ,vector
public class List_Collection {
    public static void main(String[] args) {
        //safe type- same type obejct can addded to Collection

        ArrayList<String> list=new ArrayList<>();
        list.add("hasan");
        list.add("Aamir");
        list.add("Habib");
        list.add("Habib");

        System.out.println("elements of lists :"+list);//peserved index
        System.out.println("elements at zero position :"+list.get(0));//index collection
    // duplicate
        System.out.println("elements of lists :"+list);
        list.remove("Habib");
        System.out.println("elements of lists :"+list);

        //size
        System.out.println("size of lists :"+list.size());
        // empty or not
        System.out.println(" lists empty or not :"+list.isEmpty());
        //elements contains or not
        System.out.println("elements of lists :"+list.contains("hasan"));

        //set elements
        list.set(1,"moin");
        System.out.println("elements of lists :"+list);
        //add any index
        list.add(3,"kashif");
        System.out.println("elements of lists :"+list);

        //unsafe type- different type obejct can addded to Collection

        LinkedList li=new LinkedList();
        li.add("pasi");
        li.add(121);
        li.add(12300.90);
        li.add(true);
        System.out.println("elements of list :"+li);


        //vector

        Vector<String> vector=new Vector<>();
       vector.addAll(list);
        System.out.println("elements of vector:"+vector);
        vector.clear();
        System.out.println("elements of vector :"+vector);

    }
}
