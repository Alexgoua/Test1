package Lesson16;

public class Test4 {

}
class Employee {
    double salary;
    boolean isManager;
    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}
class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(100.5, true);
        // System.out.println(emp1.isManager + emp1.salary); - ошибка
        System.out.println("On manager? - " + emp1.isManager + " Ego ZP: " + emp1.salary);
    }
}