package Homework.Lesson19;

public class Test2 {
    static String[] abc(String[] ... s) {
        int count = 0;
        for (String[] array1: s) {
            for (String s1: array1) {
                count++;
            }
        }
        String[] array = new String[count];
        count = 0;
        for (String[] array1: s) {
            for (String s1: array1) {
                array[count] = s1;
                count++;
            }
        }
        for (String s2: array) {
            System.out.print(s2 + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        String[] s1 = {"aaa", "bbb", "ccc"};
        String[] s2 = {"dd", "ee", "ff", "gg", "hh"};
        String[] s3 = {"iiii", "jjjj"};

        String[] arrayNew = abc(s1, s2, s3);

        for (int i = 0; i < arrayNew.length; i++) {
            for (String s5: args) {
                if (arrayNew[i].equals(s5)) {
                    arrayNew[i] = null;
                    break;
                }
            }
        }
        System.out.println();
        for (String s: arrayNew) {
            System.out.print(s + " ");
        }
    }
}