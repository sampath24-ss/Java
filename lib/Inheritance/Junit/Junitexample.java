package lib.Inheritance.Junit;
import java.util.*;
/**
 * Junitexample
 */
public class Junitexample {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
    ArrayList<Integer> pr = new ArrayList<>();
    int isPrime = 0;
	int sum = 0;
	int count = 0;
    for (int i = 0; i < arr.length; i++) {
         isPrime = checkPrime(arr[i]);
         if(isPrime == 1){
            pr.add(arr[i]);
			count++;
         }
        }
		if(count == 0){
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
		}
	//	System.out.println(count); 
	//	Collections.sort(pr);
      
	//	System.out.println( pr);
        
       for(int i = 1; i < pr.size(); i++){
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

    
    

