package Homework.Lesson8;

public class Test2 {
    double r;
    Test2 (double newRadius) {
        r = newRadius;
    }
    static final double pi = 3.14;

    double ploshadKruga(double radius) {
        return pi * radius * radius;
    }
    static double dlinnaOkruzhnosti(double radius) {
        return pi * radius * 2;
    }
    void showInfo(double radius) {
        System.out.println("Radius = " + radius);
        System.out.println("Ploshad kruga = " + ploshadKruga(radius));
        System.out.println("Dlinna okruzhnosti = " + dlinnaOkruzhnosti(radius));
    }
}
class Test2Exe {
    public static void main(String[] args) {
        Test2 krug1 = new Test2(3.0);
        System.out.println("Ploshad kruga s radiusom " + krug1.r + " ravna " + krug1.ploshadKruga(krug1.r));
        System.out.println();
        System.out.println("Dlinna okruzhnosti s radiusom " + krug1.r + " ravna " + Test2.dlinnaOkruzhnosti(krug1.r));
        System.out.println();
        System.out.println("Informaciya o kruge s raduisom " + krug1.r + ":");
        krug1.showInfo(krug1.r);
    }
}