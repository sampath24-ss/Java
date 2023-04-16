import java.util.HashSet;
import java.util.Iterator;

public class Hashing1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        
        //check the values
        if (set.contains(1)) {
            System.out.println("contains 1");
        }
        //remove the value
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("removed 1 succesfully");
        }
       System.out.println(set);
        //iterrator
        Iterator it = set.iterator();
        //hasNext; next
      while (it.hasNext()) {
        System.out.println(it.next());
      }
       
    }
}
