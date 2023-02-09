package Homework.Lesson18;

public class Test2 {
    static void showArray(String[][] array) {
        System.out.println("{ {" + array[0][0] + ", " + array[0][1] +"}, {" + array[1][0] + "}, {" + array[1][0] +
                            ", " + array[1][1] + "} }");
    }
    public static void main(String[] args) {
        String[][] array1 = {{"aa", "bb"},{"cc", "dd"}};
        showArray(array1);
    }
}
