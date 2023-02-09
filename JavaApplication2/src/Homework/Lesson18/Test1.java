package Homework.Lesson18;

public class Test1 {
    static int[] sortirovka(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }
            int indexOfMin = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] == min) {
                    indexOfMin = j;
                    break;
                }
            }
            array[indexOfMin] = array[i];
            array[i] = min;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 9, 3, -8, 0, 5, 4, 1, -8, 9};
        for (int j : sortirovka(array1)) {
            System.out.print(j + " ");
        }
    }
}
