package lib.StaticExample;

//import java.io.OutputStream;

public class Human {
    int age;
    int salary;
    boolean married;
    static long population;
    /**
     * @param age
     * @param salary
     * @param married
     */
    static void message(){
    System.out.println("hello bro!!");
    }
    public Human(int age, int salary, boolean married) {
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        Human.message();
    }
}
