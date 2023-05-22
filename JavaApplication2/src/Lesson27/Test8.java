package Lesson27;
import java.io.*;
public class Test8 {
    static int abc() {
        int a = 5;
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            return a;
        }
        finally {
            a = 10;
            System.out.println("Eto bloсk finally");
        }
        return a;
    }
    static StringBuilder def() {
        StringBuilder a = new StringBuilder("privet");
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            return a;
        }
        finally {
            a.append("!!!");
            System.out.println("Eto bloсk finally");
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(abc());
        System.out.println();
        System.out.println(def());
    }
}
