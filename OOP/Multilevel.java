package OOP;

public class Multilevel extends Inherit{

    String customer;
    public Multilevel(int length, int weight, int height, String type , String customer) {
        super(length, weight, height, type);
        this.customer = customer;
        
    }
}
