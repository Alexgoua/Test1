package Lesson20;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("poka"));
        list.add(new String("hello"));
        for(String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.indexOf("poka")); // индекс 0, так как equals() перезаписан для String
        System.out.println(list.lastIndexOf("poka")); // возвращает последний индекс
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("ok"));
        System.out.println(list.toString());
        System.out.println(list); //не явно вызывает toString()
    }
}
