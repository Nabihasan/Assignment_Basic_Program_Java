package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;
public class StreamObject {

    public static void main(String gg[]){

        //1.blank stream
        Stream<Object> s=Stream.empty();

        //2.Array // collection/object
        String name[]={"hasan","raja","aamir"};
        Stream<String> s1=Stream.of(name);
        s1.forEach(e->{
            System.out.println(e);
        });
        //3
        IntStream s3= Arrays.stream(new int[]{12,34,54,56,6});
        s3.forEach(value -> {
            System.out.println(value);
        });
        //4. list,set

        List<Integer> list=new ArrayList<Integer>();
        list.add(33);
        list.add(33);
        list.add(33);
        list.add(33);
        Stream<Integer> s4=list.stream();
        s4.forEach(e->{
            System.out.println(e);
        });

    }
}
