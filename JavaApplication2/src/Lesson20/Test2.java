package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");
        for(String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(list.get(3));

        list.set(1, "!!!");
        for(String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list.remove("privet"); //удалит, так как для String equals() перезаписан
        for(String s: list) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Petrov");
        list1.add("Sidorov");

        list.addAll(list1); //добавляет элементы list1 в конец list
        // list.addAll(2, list1); - добавит элементы list1 начиная со 2й позиции list
        for(String s: list) {
            System.out.print(s + " ");
        }

        //list.clear(); - полностью очистит list
    }
}
