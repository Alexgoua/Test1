package Lesson19;

public class Test6 {
    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int a: array) {
            a = 3;
        }
        for (int a: array) {
            System.out.print(a + " "); // обратить внимание, что элементы array не были заменены
        }
        System.out.println();

        String[] array1 = {"Privet", "Poka", "Ok"};
        for (String s: array1) {
            s = new String("Hello");
        }
        for (String a: array1) {
            System.out.print(a + " "); // обратить внимание, что элементы array не были заменены
        }
        System.out.println();

        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3 = new StringBuilder("Ok");
        StringBuilder[] array2 = {sb1, sb2, sb3};

        for (StringBuilder sb: array2) {
            sb.append(" Java");
        }
        for (StringBuilder sb: array2) {
            System.out.print(sb + " "); // обратить внимание, что элементы array изменены методом.
                                        // То есть, зачения можно менять методом, но объекты - те же
        }
    }
}
