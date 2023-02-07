package Homework.Lesson17;

public class Test1 {
    static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result = false;
        if (sb1.length() == sb2.length()) {
            for(int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) != sb2.charAt(i)) {
                    break;
                }
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Test12345");
        StringBuilder sb2 = new StringBuilder("Test12345");

        System.out.println(ravenstvo(sb1, sb2));
    }
}
