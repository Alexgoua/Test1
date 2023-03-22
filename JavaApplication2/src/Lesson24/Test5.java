package Lesson24;

public class Test5 {
}
interface I1{
    void abc();
    default void def() {
        System.out.println("etot metod def");
    }
}
class Z1 implements I1 {
    public void abc() {
        System.out.println("eto metod abc");
    }

    public static void main(String[] args) {
        Z1 z = new Z1();
        z.abc();
        z.def();
    }
}