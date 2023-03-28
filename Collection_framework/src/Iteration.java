import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("hasan raza");
        list.add("Aamir ali");
        list.add("Habib khan");
       // list.add("Habib");
        list.add("ABC");
       // System.out.println(list);

        //iteration by for each loop
        for(String s: list){
            System.out.print(s+"\t"+s.length()+"\t");
            StringBuffer b=new StringBuffer(s);
            StringBuffer si=b.reverse();
            System.out.println(si);
        }
        System.out.println("-------iterator for only forward traversing-------");

        Iterator<String> tr=list.iterator();
        while(tr.hasNext()){
            String next=tr.next();
            System.out.println(next);
        }

        System.out.println("-------ListIterator for backward traversing-------");
        ListIterator<String> listit = list.listIterator(list.size());
        while(listit.hasPrevious()){
            String previous = listit.previous();
            System.out.println(previous);


        }
        System.out.println("-------for each method for traversing-------");
            list.forEach(e->{
                System.out.println(e);
            });
    }

}
