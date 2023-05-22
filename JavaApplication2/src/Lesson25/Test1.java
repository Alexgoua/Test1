package Lesson25;

import java.util.Dictionary;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

//        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {emp1, emp2, emp3};
//        Help_able [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};

        for (Employee emp : array2) {
            emp.work();
        }
        System.out.println();
        
        Help_able h = new Teacher();
        String s1 = null;

        System.out.println(emp1 instanceof Employee);
        System.out.println(emp1 instanceof Teacher);
        System.out.println(emp1 instanceof Driver);
        System.out.println(emp1 instanceof Help_able);
        System.out.println(s1 instanceof String);
    }
}
abstract class Employee {
    void sleep() {
        System.out.println("Employ sleeps");
    }
    abstract void work();
}
class Teacher extends Employee implements Help_able {
    public void help() {
        System.out.println("Teacher helps");
    }
    void work() {
        System.out.println("Teacher works");
    }
}
class Driver extends Employee implements Help_able {
    void work() {
        System.out.println("Driver works");
    }
    public void help() {
        System.out.println("Driver helps");
    }
}
class Doctor extends Employee implements Help_able {
    void work() {
        System.out.println("Doctor works");
    }
    public void help() {
        System.out.println("Doctor helps");
    }
}
interface Help_able {
    void help();
}