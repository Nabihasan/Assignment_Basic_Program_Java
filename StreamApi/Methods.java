package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String gg[]){

        List<String> name= List.of("hasan","habib","sohail");
       List<String> newname= name.stream().filter(e->e.startsWith("h")).collect(Collectors.toList());
        System.out.println("name :"+newname);

        List<Integer> num= List.of(11,22,3,344,54);
       List<Integer> number= num.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println("number :"+number);
    }
}
