package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));
        for(StringBuilder sb: list) {
            System.out.print(sb + " ");
        }
        System.out.println();

        System.out.println(list.indexOf("poka")); //не найдет такой, так как equals() вернет false для StringBuilder

    }
}
