package Homework.Lesson17;

public class Test1 {
    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = true;
        if (sb1.length() == sb2.length()) {
            for(int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    result = false;
                    break;
                }
            }
        } else {
            result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Test12345");
        StringBuilder sb2 = new StringBuilder("Test12345");

        System.out.println(ravenstvo(sb1, sb2));
    }
}
