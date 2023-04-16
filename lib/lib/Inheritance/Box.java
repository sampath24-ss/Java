package lib.Inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    
     Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;

    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("running box");
    }

}
