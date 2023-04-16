package Abstract;

public  class Daughter  extends Parent{
    @Override
    void career(String name) {
       System.out.println("I am " + name);
        
    }

    @Override
    void partner(String name, int age) {
        System.out.println(" i love " + name  + "her age" + age);
        
    }
   
    
}
