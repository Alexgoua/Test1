package Lesson27;
import java.io.*;
public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test10.txt");
            System.out.println("файл существует в системе и найден");
            try {
                fis2.close();
            }
            catch (IOException e) {
                System.out.println("проблемы со стримом fis2");
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
        catch (NullPointerException e) {
            System.out.println("сработал NullPointerException");
        }
    }
}
