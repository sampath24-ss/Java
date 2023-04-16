public class Finalizer {
    public static void main(String[] args) {
        int a = 10;
        Integer num = 45;
        num.intValue();
        A obj;
        for (int i = 0; i < 10000000; i++) {
            obj = new A("random");
        }

    }
}

class A{
    final int num = 10;
    String name;
    public A(String name){
        System.out.println("object is destroyed");
        this.name = name;
    }
  @Override
  protected void finalize() throws Throwable {
      // TODO Auto-generated method stub
      System.out.println("object is destroid");
      super.finalize();
  }
}
