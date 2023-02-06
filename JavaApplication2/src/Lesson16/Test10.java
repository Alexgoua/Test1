package Lesson16;

import org.w3c.dom.ls.LSOutput;

public class Test10 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        System.out.println(x==y);
        String z = " privet".trim(); //если trim() производит действие, то создается новый объект!
        System.out.println(x==z);
    }
}
