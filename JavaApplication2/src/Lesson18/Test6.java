package Lesson18;

public class Test6 {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello world");

        sb.append(array, 2, 3); // к sb добавить элементы array, начиная с 2го, 3 штуки

        sb.insert(2, array, 1, 3); // в sb со 2й позиции вставить элементы array с 1го, 3 штуки

        System.out.println(sb);
    }
}
