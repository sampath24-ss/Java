package Inheritance.Junit;

import java.util.ArrayList;
import java.util.Collections;

public class Exam {
    public static void main(String[] args) {
    int[] arr = {10,41,18,50,43,31,29,25,59,96,67};
    ArrayList<Integer> pr = new ArrayList<>();
    int isPrime = 0;
    for (int i = 0; i < arr.length; i++) {
         isPrime = checkPrime(arr[i]);
         if(isPrime == 1){
            pr.add(arr[i]);
         }
        }
      
        Collections.sort(pr);
        int sum = 0;
       for(int i = 0; i < pr.size()-1; i++){
        sum = sum + pr.get(i);
       }
       System.out.println(sum);
        
    }


private static int checkPrime(int i) {
   if(i <= 1){
    return 0;
   }
   for (int j = 2; j <= i/2; j++) {
    if(i%j == 0){
        return 0 ;
    }
}
    return 1;
   
}
}