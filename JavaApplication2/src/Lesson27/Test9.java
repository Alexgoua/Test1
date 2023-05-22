package Lesson27;
import java.io.*;
public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e; //снова выбрасывает exception
        }
        finally {
            System.out.println("Eto bloсk finally");
        }
    }
    void method() {
        try {
            abc();
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception poyman i polnostyu obrabotan");
        }
    }
    void def() {
        try {
            int[] array = {1, 2, 3};
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        }
        finally {
            System.out.println("Eto bloсk finally");
        }
    }
}
