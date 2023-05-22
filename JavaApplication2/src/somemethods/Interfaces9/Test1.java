package somemethods.Interfaces9;

public class Test1 {

}
interface I1 {
    private static void method1() {
        System.out.println("Static method1");
    }
    private void method2() {
        System.out.println("non-static method");
    }
    default void method3() {
        method1();
        method2();
    }
    static void method4() {
        method1();
//        method2(); non-static метод не может быть вызван в static методе
    }
}