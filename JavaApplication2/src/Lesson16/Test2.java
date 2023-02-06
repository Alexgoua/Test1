package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        String s2 = new String("    jkl     jfket     ");
        String s3 = new String("privet");

        String s10 = s1.substring(3);
        System.out.println(s10);

        String s11 = s1.substring(3, 7); // index 7 не будет включен!
        System.out.println(s11);

        String s12 = s2.trim(); //убирает пробелы в начале и в конце
        System.out.println(s12);

        String s14 = s3.replace('r', 'Z'); // меняет char на char
        System.out.println(s14);
        String s15 = s3.replace("vet", "vivka"); // меняет String на String
        System.out.println(s15);

        System.out.println(s1.concat(s2));
    }
}
