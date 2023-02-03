package Homework.Lesson11;

public class Car {
    String color;
    String engine;
    int doors;

    public Car(String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
    public void showInfo() {
        System.out.println(color + ", " + engine + ", " + doors);
        System.out.println();
    }
}

class CarTest {
    void changeDoors(Car c, int newDoors) {
        c.doors = newDoors;
    }

    void swapColor(Car c1, Car c2) {
        String c3 = c1.color;
        c1.color = c2.color;
        c2.color = c3;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car c1 = new Car("red", "V8", 2);
        Car c2 = new Car("black", "V6", 4);

        ct.changeDoors(c1, 3);
        ct.swapColor(c1, c2);
        c1.showInfo();
        c2.showInfo();

    }
}