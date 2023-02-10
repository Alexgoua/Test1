package Homework.Lesson18;

public class Test2 {
    static void showArray(String[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length -1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j] + "}");
                    if (i != array.length - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.print(" }");
    }
    public static void main(String[] args) {
        String[][] array1 = {{"aa", "bb"},{"cc", "dd", "ee"}, {"ff"}, {"gg", "hh", "ii", "jj"}};
        showArray(array1);
    }
}
