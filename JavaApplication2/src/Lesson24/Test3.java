package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
    }
}
class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("kushat");
    }
    void sleep() {
        System.out.println("spat");
    }
}
class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashini;
    void vodit() {
        System.out.println("Vodit");
    }
    public void pomosh() {
        System.out.println("Voditel okazivaet pomosh");
    }
    public void tushitPojar() {
        System.out.println("Voditel tushit pojar");
    }
    public void swim() {
        System.out.println("Voditel mojet plavat");
    }
}
class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomosh");
    }
    public void tushitPojar() {
        System.out.println("Uchitel tushit pojar");
    }
}

interface Help_able {
    void pomosh();
    void tushitPojar();
}
interface Swim_able {
    void swim();
}
abstract class Y implements Swim_able{}
abstract class X extends Y{}
class Z extends Y {
    public void swim() {}
}