import java.util.*;
public class Arrays {
public static void main(String[] args) {
    int arr[] = {15,16,1,-2,-13,61,11,4,3,19,-4,17,-3,90,-65,67,12,0,13,2,3,43,21,-17,2,42};
   System.out.println(Arrays.sort(arr));
    String str = "Wipro";
    String str1[] = str.split(" ");
    int sum = 0;
    int mul = 1;
    for (int i = 0; i < str1.length; i++) {
        String c = str1[i].toLowerCase();
        for (int j = 0; j < c.length(); j++) {
           sum += arr[c.charAt(i)-'a'];
            }
            mul *= sum;
    }
    System.out.println(mul); 
}
    
}
