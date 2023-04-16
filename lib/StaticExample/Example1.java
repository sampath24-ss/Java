package lib.StaticExample;

public class Example1 {
    public static void main(String[] args) {
         test a = new test("rajarao");
        // test b  = new test("ramgopal");
       // test.Object foo = new Object();
     //  int a ;
       System.out.println(a);;
    }
}
class test {
    static String name;
    public test(String naame) {
        test.name = naame;
    }


public String toString() {
    return name;
}
}

