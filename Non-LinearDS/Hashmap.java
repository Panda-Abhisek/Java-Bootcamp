import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("India", 160);
        map.put("China", 200);
        map.put("US", 100);
        map.put("Nepal", 5);

        // get all entries
        System.out.println(map);

        // search 
        System.out.println(map.containsKey("India"));
        
        // delete
        map.remove("Nepal");

        System.out.println(map);

        // Iteration 1 - using foreach
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println();

        // Iteration 2 - converting to set
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
