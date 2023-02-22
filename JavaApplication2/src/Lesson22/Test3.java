package Lesson22;

import Homework.Lesson10.p4.D;

public class Test3 {
    void uvelichZP(Employee e) {
        e.salary = e.salary + 100;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.lechit();
        doc.specializachiya = "hirurg";
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
class Doctor extends Employee {
    String specializachiya;
    void lechit() {
        System.out.println("lechit");
    }
}
class Teacher extends Employee {
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
}
class Driver extends Employee {
    String nazvanieMashini;
    void vodit() {
        System.out.println("Vodit");
    }
}