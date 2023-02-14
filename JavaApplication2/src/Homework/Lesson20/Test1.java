package Homework.Lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
    static ArrayList abc(String... s) {
        ArrayList <String> array = new ArrayList<>();
        for (String s1: s) {
            array.add(s1);
        }
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(i).equals(array.get(j))) {
                    array.remove(j);
                    j--;
                }
            }
        }
        System.out.println(array);
        return array;
    }
    public static void main(String[] args) {
        abc("ww", "aa", "55", "cc", "qq", "bb", "bc", "aa", "cc", "cc", "ac", "55", "ww", "nn", "nn", "nn", "pp", "!!");
    }
}