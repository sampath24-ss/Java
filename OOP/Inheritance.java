package OOP;

public class Inheritance {
    int length;
    int weight;
    int height;
    /**
     * @param length
     * @param weight
     * @param height
     */
   
    public Inheritance(int length, int weight, int height) {
        super();
        this.length = length;
        this.weight = weight;
        this.height = height;
        
    }
    public Inheritance(int length){
        this.height = length;
        this.length = length;
        this.weight = length;
    }
}
