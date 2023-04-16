package Polymorphism;

public class Triangle extends Shapes {
    @Override // used to check
    // this will run when obj of triangle is created
    // hence it is override the parent method
    void area(){
        System.out.println("i am in shapes  i am triangle ");
    }
}
