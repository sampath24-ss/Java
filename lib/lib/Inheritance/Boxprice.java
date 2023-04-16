package lib.Inheritance;

public class Boxprice extends BoxWeight {
    double price;
    Boxprice(){
     this.price = 1;
    }

    /**
     * @param l
     * @param h
     * @param w
     * @param weight
     */
    public Boxprice(double l, double h, double w, double weight,double price) {
        super(l, h, w, weight);
         this.price = price ;
    }

    
}
