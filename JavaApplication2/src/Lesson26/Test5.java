package Lesson26;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(5);
        A a1 = new A();
        A a2 = new A();
    }
}
class A {
    static {
        System.out.println("Eto static init block");
    }
    A() {
        System.out.println("Eto konstruktor");
    }

    {
        System.out.println("Eto init block 1");
    }
    {
        System.out.println("Eto init block 2");
    }
    public static void main(String[] args) {
        System.out.println(5);
        A a1 = new A();
        A a2 = new A();
    }
}