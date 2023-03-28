import java.util.HashMap;
import java.util.HashSet;

public class Map {
    public static void main(String[] args) {

        HashMap<String,Integer> map=new HashMap<>();
        map.put("core - java",4000);
        map.put("Advance - java",11000);//value can be duplicate
        map.put("Spring",16000);   //order is not peserved
        map.put("Hibernate",11000);
        map.put("Hibernate",11000);  //duplicate key is not allowed

        //traverse the map

        map.forEach((key,value)->{
            System.out.print(key);
            System.out.print("-->");
            System.out.println(value);
        });

        System.out.println(map.get("spring"));


    }
}
