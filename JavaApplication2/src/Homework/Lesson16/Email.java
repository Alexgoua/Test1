package Homework.Lesson16;

public class Email {
    static void email(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') {
                i++;
                while (s.charAt(i) != '.') {
                    System.out.print(s.charAt(i));
                    i++;
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
