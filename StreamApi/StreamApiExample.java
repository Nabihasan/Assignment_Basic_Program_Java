package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample {


    public static void main(String gg[]){


        List<Integer> list1= List.of(12,34,3,5,45,66); //immutable list

        System.out.println(list1);

        List<Integer> list2=new ArrayList<>();  //mutable list
        list2.add(12);
        list2.add(3);
        list2.add(10);
        list2.add(90);
        list2.add(13);
        list2.add(11);
        list2.add(91);
        System.out.println(list2);
    //without Stream
        List<Integer>  list3= Arrays.asList(2,3,4,5,21,34,54,65,76);    //immutable list
        System.out.println(list3);
        List<Integer> listOdd = new ArrayList<>();
        for(Integer i:list1){
            if(i%2!=0){
                listOdd.add(i);
            }
        }
        System.out.println("list -1"+list1);
        System.out.println("odd list :"+listOdd);

        //with stream

        Stream<Integer> stream=list1.stream();
        List<Integer> nlist=list1.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("new list with stream"+nlist);

        List<Integer> oddlist=list2.stream().filter(i -> i%2!=0).collect(Collectors.toList());
        System.out.println("new oddlist with stream"+oddlist);

        List<Integer> list4=list3.stream().filter(i->i>10).collect(Collectors.toList());
        System.out.println("greater than 10 with stream"+list4);
    }

}
