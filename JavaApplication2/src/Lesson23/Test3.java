package Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Employee1();
        Teacher1 t = new Teacher1();
        e.eat();
        t.eat();
        Employee1 e1 = new Teacher1();
        e1.eat();
    }
}
class Employee1 {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat() {
        System.out.println("kushaet rabotnik");
    }
    void sleep() {
        System.out.println("spat");
    }
}
class Teacher1 extends Employee1 {
    void eat() {
        System.out.println("kushaet uchitel");
    }
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
}