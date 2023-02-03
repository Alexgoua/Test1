package Lesson9;

public class Car {
    int bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb = 5; //any lengh;
    int _lsdkfj534534jldfd_$$$ = 8; //doesn't start with digit;
    public static double PI = 3.14; // constants should be in upper case;



    String color;
    String engine;
    static int count;

    public Car(String color, String engine) {
        int x = 5; // локальные переменные не имеет дефолтных значений, нужно сразу определять!
        int y = 10;
        count++;
        this.color = color;
        this.engine = engine;
    }

    void changeColor(String color) {
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        System.out.println(c.color);
        c.changeColor("Black");
        System.out.println(c.color);
    }
}
