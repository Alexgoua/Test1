package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
       emp.sleep(); //не виден, так как он private
        t.sleep(); //это не overrided method, а просто новый, так как private методы не наследуются
        Employee2 e = new Teacher2();
        e.sleep();

    }
}
class Eda {}
class Frukti extends Eda {}
class Employee2 {
    double salary = 100;
    String name = "Kolya";
    void sleep() {
        System.out.println("spit rabotnik   ");
    }
}
class Teacher2 extends Employee2 {
    public Eda eat() {
        System.out.println("kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
    void sleep() {
        System.out.println("spit uchitel");
    }
}