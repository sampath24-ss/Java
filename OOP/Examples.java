package OOP;

public class Examples {

   int num;
   public Examples(int num){
    this.num = num;
   }
    
    @Override
    public String toString() {
        return "Examples [] : " + num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }
    // return random int value
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
    public static void main(String[] args) {
        Examples ex = new Examples(34);
      int x =  ex.hashCode();
      System.out.println(ex.getClass().getSuperclass());
    }

}
