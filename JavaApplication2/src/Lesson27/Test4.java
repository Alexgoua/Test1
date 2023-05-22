package Lesson27;

public class Test4 {
    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("U nas est massiv");

        try {
            System.out.println("Do vozmozhnogo exception");
            System.out.println(array[5]);
            System.out.println("Vsem horoshego dnya");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bil poiman exception :" + e);
        }
        finally {
            System.out.println("eto finally blok");
        }
        System.out.println("Danniy kod uzhe ne imeet otnosheniya k isklyucheniyam");
    }
}
