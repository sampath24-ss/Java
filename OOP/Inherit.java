package OOP;

public class Inherit extends Inheritance {
   private static String type;

    /**
     * @param length
     * @param weight
     * @param height
     * @param type
     */
    public Inherit(int length, int weight, int height, String type) {
        super(length, weight, height);
        System.out.println(super.weight);
        this.type = type;

    }

    /**
     * @param length
     * @param type
     */
    public Inherit(int length, String type) {
        super(length);
        this.type = type;
    }

    /**
     * @return the type
     */
    public static String getType() {
        return type;
    }

}
