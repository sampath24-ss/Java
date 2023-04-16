package lib.StaticExample;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 8530;
        int n2 = 5620;
        int n3 =  7532;
        int[] b = {n1,n2,n3};
        int[] a = new int[10];
          for (int i = 0; i < b.length; i++) {
            int temp = b[i];
            while(temp != 0){
                int r = temp%10;
                a[r]++;
                temp/=10;
            }
        }
        System.out.println(Arrays.toString(a));
      int max = Integer.MIN_VALUE;
      int d = 0;
      for (int i = 0; i < a.length; i++) {
        if (max <= a[i] ) {
            max = a[i];
            d=i;
            
        }
      }
      int min = Integer.MAX_VALUE;
      int c = 0;
      for (int i = 0; i < a.length; i++) {
        if (min > a[i] && a[i] != 0) {
            min = a[i];
          c = i;
        }
      }
      int x = getmax(n1);
      int y = getmax(n2);
      int z = getmax(n3);
      int m = Math.max(x, Math.max(y, z));
     // System.out.println(m);
      int h = getmin(n1);
      int j = getmin(n2);
      int k = getmin(n3);
      int l = Math.min(h, Math.min(j, k));
      int p = d*1000+c*100+m*10+l;
      System.out.println(p); 
    
        }
        private static int getmin(int n1) {
            int a = Integer.MAX_VALUE;
            while (n1 > 0) {
                int c = n1%10;
                if (c < a ) {
                    a = c;
                }
                n1 = n1/10;
            }
            return a;
       
    }
        public static int getmax(int n){
            int a = 0;
            while (n > 0) {
                int c = n%10;
                if (c > a ) {
                    a = c;
                }
                n = n/10;
            }
            return a;
        }
    }

