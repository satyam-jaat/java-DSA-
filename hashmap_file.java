import java.util.HashMap;
import java.util.Map;
public class hashmap_file {
    public static void main(String args[]) {
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(2,1);
        map.put(3,1);
        map.put(4,1);

        System.out.println("values for key 1 is: "+ map.get(1));
        System.out.println("values for key 2 is: "+ map.get(2));
        System.out.println("values for key 3 is: "+ map.get(3));
        System.out.println("values for key 4 is: "+ map.get(4));

        map.put(1, map.getOrDefault(1, 0)+1);

        System.out.println("Updated value of key 1 is: "+ map.get(1));

        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println("Value of key ("+entry.getKey()+") is: "+entry.getValue());
        }
    }
}
