package lib.StaticExample;

public class Innerclass {
    public static void main(String[] args) {
        test1 a = new test1("rajarao");
        test1 b  = new test1("ramgopal");
        test2 c = new test2("raja");
        test2 d  = new test2("gopal");
        test3 e = new test3("raja");
       test3 f  = new test3("gopal");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
        System.out.println(d.name);
        System.out.println(e.name);
        System.out.println(f.name);
    }
    // this inner test1 depend on the innerclass
    //returns different different names because it is not dependent on the innerclass object
     static class test3{
         String name;
        public test3(String naame1) {
            this.name = naame1;
        }
       }
    }
     //returns name 2 times because it refers to test1 as same static variable
    class test1{
        static String name;
     public test1( String name) {
          test1.name = name;
      }
    }

// doesnt depend on any outer class 
 class test2{
    String name;
   test2(String naame) {
      this.name = naame;
  }
 
}


