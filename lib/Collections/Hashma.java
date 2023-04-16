package lib.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Hashma {
    public static void main(String[] args) {
        HashMap<Integer,String> str = new HashMap<>();
        str.put(1, "sampath");
        str.put(2, "sam");
        str.put(3, "rajan");
       str.get(1).get("sampath");
       System.out.println(str.values());
    }
}
