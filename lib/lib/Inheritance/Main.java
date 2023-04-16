package lib.Inheritance;

public class Main  {
public static void main(String[] args) {
    Box box = new Box(4,7.9,9.9);
    Box box2 = new Box(box);
    System.out.println(box2.l + " " + box2.w + " "+ box2.h);
    BoxWeight box3 = new BoxWeight();
    System.out.println(box3.h +" " +  box3.Weight);
    box3.information();
    Box box4 = new BoxWeight(5, 4, 3, 2);
    //System.out.println(box4);
    Boxprice box5 = new Boxprice(10, 20, 30, 40, 5);
    System.out.println(box5.price);

}
    
}
