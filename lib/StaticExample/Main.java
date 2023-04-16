package lib.StaticExample;

public class Main {
    public static void main(String[] args) {
        
    
    Human ram = new Human(30, 19000,false);
    Human ranjith = new Human(30, 19000,false);
    Human rohit = new Human(20, 20000, false);
     System.out.println(Human.population);
     System.out.println(Human.population);
     System.out.println(Human.population);
    // System.out.println(InnerMain.whishes());
    InnerMain sam = new InnerMain();
    sam.whishes();
    }
}
    /**
     * InnerMain
     */
    class InnerMain {
    
        
    
      void whishes(){
        System.out.println("hello");
    }
}
    
