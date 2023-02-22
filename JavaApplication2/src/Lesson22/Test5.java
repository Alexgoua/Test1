package Lesson22;

public class Test5 {
}
class Human3 {
    Human3(String n) {
        this(n, null);
    }
    Human3(String n, String s) {
    name = n;
    surname = s;
}
        String name;
        String surname;
}
class Student3 extends Human3 {
    Student3() {
        super("Petya");
    }
    public static void main(String[] args) {
        Student3 s = new Student3();
    }
}