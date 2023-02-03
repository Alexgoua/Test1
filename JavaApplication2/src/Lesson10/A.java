package Lesson10;
import Lesson9.Car;
import Lesson9.Student;
// import Lesson9.*; - imports all cases from the package;
public class A {
    public static void main(String[] args) {
        Lesson9.Car c1 = new Lesson9.Car("red", "V6");
        Car c2 = new Car("black", "V4");
        Student st1 = new Student();
    }
}

class B {
    Student st2 = new Student();
}
