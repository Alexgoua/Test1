package somemethods.ArrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        List <String> list = List.of("odin", "dva", "tri");
        System.out.println("list = " + list);
//        list.add("chetire"); //вернет Exception, так как такой List неизменяемый

        List <String> list2 = List.copyOf(al1); //также неизменяемый
        System.out.println("list2 = " + list2);
    }
}
