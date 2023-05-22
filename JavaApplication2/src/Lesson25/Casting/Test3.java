package Lesson25.Casting;

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        Employee emp = new Doctor();

        ((Doctor)emp).help();
//        Doctor d1 = emp1; - нельзя написать, так как не каждый Работник является Доктором
//        Doctor d1 = (Doctor)emp1; - маскирует переменную emp1 под переменную типа Doctor
        System.out.println(((Doctor)emp1).specializachiya);
        ((Doctor)emp1).lechit();

//        Doctor d1 = (Doctor) emp2; //компилятор пропускает, но runtime будет Exception
        System.out.println();
        Employee [] array = {emp1, emp2, emp3, emp4};
        for(Employee e : array) {
            if (e instanceof Driver) {
                System.out.println(((Driver) e).nazvanieMashini);
                ((Driver) e).vodit();
            }
        }
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
class Doctor extends Employee implements Help_able{
    String specializachiya = "xirurg";
    void lechit() {
        System.out.println("lechit");
    }
    public void help() {
        System.out.println("Doctor okazivaet pomosh");
    }
}
class Teacher extends Employee {
    int kolichestvoUchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
}
class Driver extends Employee {
    String nazvanieMashini = "Mercedes";
    void vodit() {
        System.out.println("Vodit");
    }
}
interface Help_able {
    void help();
}