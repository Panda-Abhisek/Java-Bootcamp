import java.util.HashSet;
import java.util.Iterator;

 public class HashSetImpl {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // print all elements
        System.out.println(set);

        // check 
        System.out.println("Size of set : " + set.size());

        // searching
        if (set.contains(2)) {
            System.out.println("2 - Exists");
        } else {
            System.out.println("Doesn't Exists");
        }

        // delete
        System.out.println("Remove 2 " + set.remove(2));

        // iterate over set
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // isEmpty check
        System.out.println(set.isEmpty());
    }
}