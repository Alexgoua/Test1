package somemethods;

import java.util.Arrays;

//compare - сравнивает, у кого меньше ref
//mismatch - возвращает индекс первого расхождения массивов, либо -1 - если они одинаковые
public class Test2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};
        char[] array3 = {'p','r','i', 'v', 'e', 't'};
        char[] array6 = {'p','r','i', 'v', 'e', 't', 'o'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i','v', 'k', 'a'};
        char[] array7 = null;
        char[] array8 = null;

        System.out.println(Arrays.compare(array1, array2));//array1 короче array2 ? Нет, возвращает отрицательное число
        System.out.println(Arrays.compare(array2, array1));//array2 короче array1 ? Да, возвращает положительное число
        System.out.println(Arrays.compare(array5, array2));//array5 и array2 одинаковые по длинне, возвращает 0
        System.out.println(Arrays.compare(array3, array4));//array3 позже в словаре? Нет, возвращает отрицательное
        System.out.println(Arrays.compare(array3, array6));//array3 позже в словаре? Нет, возвращает отрицательное
        System.out.println(Arrays.compare(array3, array7));// null array ref всегда меньше чем notNull
        System.out.println(Arrays.compare(array8, array7));//array8 ref == array7 ref
        System.out.println();
        System.out.println(Arrays.mismatch(array2, array5)); //-1
        System.out.println(Arrays.mismatch(array2, array1)); //3
        System.out.println(Arrays.mismatch(array3, array4)); //4
        System.out.println(Arrays.mismatch(array3, array6)); //6
    }
}
