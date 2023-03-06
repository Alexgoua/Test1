package Lesson23;

public class Test2 {
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
//        emp1.lechit(); не может вызвать этот метод, так как он есть лишь у сабкласса, а не у Employee

        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();

        Doctor d2 = new Xirurg();
        System.out.println(d2.age);
        Employee emp4 = new Xirurg();
    }
}
class Employee {
    double salary = 100;
    String name = "Kolya";
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
    void lechit() {
        System.out.println("lechit");
    }
}
class Xirurg extends Doctor {
    String skalpel;
    void operaciya(){}
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