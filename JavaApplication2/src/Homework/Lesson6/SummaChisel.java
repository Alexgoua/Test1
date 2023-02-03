package Homework.Lesson6;

public class SummaChisel {

    void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
    void sum (int a, int b, int c) {
        System.out.println(a + b + c);
    }
    void sum (int a, int b) {
        System.out.println(a + b);
    }
    void sum(int a) {
        System.out.println(a);
    }
    void sum() {
        System.out.println(0);
    }
}
class SummaChiselTest {
    public static void main(String[] args) {
        SummaChisel sc = new SummaChisel();

        sc.sum(3, 6);
        sc.sum(2);
        sc.sum();
    }
}
