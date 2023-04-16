package lib.Inheritance;

public class Object {
    public static void main(String[] args) {
        Student sam = new Student(56,"samrock", 55);
      Student raj = new Student(12,"raja",90);
      Student random = new Student(raj);
    //   sam.changeName("rajdooth");
     
        
    //    // sam.changeName("rajdooth");
        System.out.println(random.marks);
        System.out.println(random.name);
     //   System.out.println(random.greething());
          random.greething("sampath");
    //   //  sam.changeName("rajdooth");
    //     System.out.println(sam.rollno);
    //    System.out.println(raj.marks);
    //     System.out.println(raj.name);
    //     System.out.println(raj.rollno);
        
       
    }
}
 class Student{
   
    
    int rollno ;
    String name ;
    float marks = 90;
     void greething(String name){
       System.out.println("my name is  "+ name );// this.name); 
    }
    void changeName(String newname){
        name =  newname;
    }
    Student (Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rollno = other.rollno;
    }
    Student(){
        this.marks = 889;
        this.name = "sam";
        this.rollno  = 44;
    }
     Student(int marks, String naam , int roll ){
        this.marks = marks;
        this.name = naam;
        this.rollno  = roll;
       
    }
    
}
