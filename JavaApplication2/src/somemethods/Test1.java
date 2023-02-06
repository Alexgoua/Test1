package somemethods;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "privet";
        System.out.println(s1.isBlank());
        String s2 = "      ";
        System.out.println(s2.isBlank());
        System.out.println();

        String s3 = "";
        System.out.println(s3.isEmpty());
        System.out.println();

        String s4 = "   privet          ";
        System.out.println(s4.strip());
        System.out.println(s4.stripLeading());
        System.out.println(s4.stripTrailing());
        System.out.println();

        String s5 = "poka";
        String s6 = s5.strip();
        System.out.println(s5==s6);
    }
}
