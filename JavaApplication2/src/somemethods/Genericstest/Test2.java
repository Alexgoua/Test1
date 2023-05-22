package somemethods.Genericstest;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(150);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        int a = GenMethod.getSecondElement(al1);
        String s = GenMethod.getSecondElement(al2);
        System.out.println(a);
        System.out.println(s);
    }
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}
class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}
class Child extends Parent {
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}