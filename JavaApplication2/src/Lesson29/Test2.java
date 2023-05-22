package Lesson29;

public class Test2 {
    static void def(Test5 t) {
        System.out.println(t.abc("privet"));
    }

    public static void main(String[] args) {
        def(x->x.length());
    }
}
interface Test5 {
    int abc(String s);
}
