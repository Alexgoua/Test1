package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        String s2 = new String("abcdefgabcd");
        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('t');
        System.out.println(i1);
        int i2 = s1.indexOf("vet");
        System.out.println(i2);
        int i3 = s1.indexOf("z");
        System.out.println(i3);

        int i4 = s2.indexOf("a", 5); //starts finding from index 5
        System.out.println(i4);

        boolean b1 = s2.startsWith("abc");
        System.out.println(b1);
        boolean b2 = s2.startsWith("abc", 7);
        System.out.println(b2);

        boolean b3 = s2.endsWith("cd");
        System.out.println(b3);
    }
}
