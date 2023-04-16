package lib.Inheritance;

public class BoxWeight extends Box{
    double Weight;
   BoxWeight(){
    this.Weight = -1;
   }
/**
 * @param l
 * @param h
 * @param w
 * @param weight 
 */
public BoxWeight(double l, double h, double w, double weight) {
    super(l, h, w);// call the parent class constructor
   this.Weight = weight;
}

   
   }
