package Homework.Lesson8;

public class Test1 {
    static int proizvedenieTrehChisel(int a, int b, int c) {
        return a * b * c;
    }
    static void chastnoeDvuhChisel(int a, int b) {
        System.out.println("Celoe chastnoe: " + a / b);
        System.out.println("Ostatok: " + a % b);
    }
}

class Test1Exe {
    public static void main(String[] args) {
        System.out.println("Proizvedenie = " + Test1.proizvedenieTrehChisel(2, 5, 6));
        System.out.println("Proizvedenie = " + Test1.proizvedenieTrehChisel(3, 6, 9));
        Test1.chastnoeDvuhChisel(15, 6);
        Test1.chastnoeDvuhChisel(20, 8);
    }
}