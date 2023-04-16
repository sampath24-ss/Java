package OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
     Inherit op = new Inherit(23, 33,45,"amazon");
     System.out.println(op.height);
     Inherit op1 = new Inherit(23, "flipcard");
     System.out.println(op1.length);
     Inheritance obj = new Inheritance(3);
     System.out.println(obj.height * obj.length * obj.weight);
     Multilevel mul = new Multilevel(2, 3, 4, "play" ,"sampath");
     System.out.println(Inherit.getType());

     
    }

   
}
