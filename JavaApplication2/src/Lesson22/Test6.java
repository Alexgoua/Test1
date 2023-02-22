package Lesson22;

public class Test6 {
}
class Human4 {
    Human4(String n, String s) {
        name = n;
        surname = s;
    }
    String name;
    String surname;
}
class Student4 extends Human4 {
    int course;
    Student4(String name, String surname, int course) {
        super(name, surname);
        this.course = course;
    }
    public static void main(String[] args) {
        Student4 s = new Student4("Kolya", "Ivanov", 3);
        System.out.println(s.name);
        System.out.println(s.surname);
        System.out.println(s.course);
    }
}