package Sorting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exam {
    public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
   HashMap<String,Integer> hm = new HashMap<>();
   LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
   TreeMap<String,Integer> tm = new TreeMap<>();
   Out(tm); 
    
}

    private static void Out(Map<String, Integer> lm) {
        for (int i = 0; i < 5; i++) {
            lm.put("a"+i, i+1);
        }
        for (String key : lm.keySet()) {
            int c = lm.get(key);
        
System.out.println(c + ":" +key);
        }
    }

}
