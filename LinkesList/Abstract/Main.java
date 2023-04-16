package Abstract;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career("doctor");
        Daughter dau = new Daughter();
        dau.career("coder");
        Parent.hello();
        Son.hello();
    }
}
