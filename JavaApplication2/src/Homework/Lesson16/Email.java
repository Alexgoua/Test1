package Homework.Lesson16;

public class Email {
    static void email(String string) {
        char c;
        int i = 0;
        OUTER: for (; i < string.length(); i++) {
            //c = string.charAt(i);
            if (string.charAt(i) == '@') {
                while (string.charAt(i) != '.')
                 {
                    i++;
                    System.out.print(string.charAt(i));
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        String s = "test1@yopmail.com; user34@yahoo.com; ona@gmail.com;";

        email(s);
    }
}
