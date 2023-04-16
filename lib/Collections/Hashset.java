//package lib.Collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
   
        hset.add(1);
        hset.add(2);
        hset.add(3);
        hset.contains(2);
        hset.remove(2);
       Iterator<Integer> s = hset.iterator();
       while(s.hasNext()){
        System.out.println(s.next());
       }
       ArrayList<Integer> h = new ArrayList<>(hset);
       System.out.println(h);
    }
}
