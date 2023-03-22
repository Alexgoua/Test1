package Homework.Lesson23.p2;

import Homework.Lesson23.p1.X2;

public class Y2 extends X2 {
    public void abc() {
        System.out.println('Y');
    }
    public void def() {
        Y2 y = new Y2();
        y.abc();
    }
    public void ghi() {
        X2 x = new Y2();
        x.abc();
    }

    public static void main(String[] args) {
        Y2 a = new Y2();
        a.abc();
        a.def();
        a.ghi();
    }
}
