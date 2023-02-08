package Lesson17;
class Car{}
public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(5));
        System.out.println(sb2.indexOf(" "));
        System.out.println();

        System.out.println(sb2.indexOf("o"));
        System.out.println(sb2.indexOf("o", 2));
        System.out.println();

        System.out.println(sb2.substring(5));
        System.out.println(sb2.substring(5, 8));
        System.out.println();

        System.out.println(sb2.subSequence(5, 8));
        System.out.println();

        System.out.println(sb2.append(22)); // параметр может быть любой примитивный тип данных и не только
        System.out.println(sb2.append(true));
        System.out.println(sb2.append(new Car()));
        System.out.println();

        System.out.println(sb2.insert(3, 55));
        System.out.println();

        StringBuilder sb10 = new StringBuilder("Hello world");
        System.out.println(sb10.delete(3, 6));
        System.out.println(sb10.deleteCharAt(2));
        System.out.println(sb10.reverse());
        System.out.println();

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        System.out.println(sb12.replace(0, 4, "Pete"));
        System.out.println(sb12.capacity());
    }
}
