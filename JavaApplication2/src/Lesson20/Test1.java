package Lesson20;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList <String> list2 = new ArrayList();
        list2.add("poka");
        //list2.add(s); - можно добавлять лишь объекты типа данных String
        ArrayList <StringBuilder> list3 = new ArrayList<>(30); // вместимость 30
        list3.add(new StringBuilder("ok"));
        ArrayList <StringBuilder> list4 = new ArrayList<>(list3); //создается новый объект!
        System.out.println(list4 == list3); //false

    }
}
class Car {}
class Student{}