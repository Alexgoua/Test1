package Homework.Lesson29;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String name;
    String department;
    double salary;
    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class EmployeeTest {
    void printEmployee(Employee e) {
        System.out.println("Имя: "+e.name+", отдел: "+e.department+", зарплата: "+e.salary+".");
    }
    void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> t) {
        for(Employee e: aL) {
            if (t.test(e)) {
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        Employee emp1 = new Employee("Eva", "IT", 200);
        Employee emp2 = new Employee("Petr", "E", 340);
        Employee emp3 = new Employee("Fedor", "IT", 500);
        Employee emp4 = new Employee("Evgen", "D", 450);
        Employee emp5 = new Employee("Olga", "E", 300);
        Employee emp6 = new Employee("Sveta", "IT", 400);
        Employee emp7 = new Employee("Kolya", "E", 150);
        Employee emp8 = new Employee("Ekaterina", "IT", 180);
        Employee emp9 = new Employee("IT", "IT", 450);
        arrayList.add(emp1);
        arrayList.add(emp2);
        arrayList.add(emp3);
        arrayList.add(emp4);
        arrayList.add(emp5);
        arrayList.add(emp6);
        arrayList.add(emp7);
        arrayList.add(emp8);
        arrayList.add(emp9);

        EmployeeTest eT = new EmployeeTest();
        eT.filtraciyaRabotnikov(arrayList, emp -> emp.department=="IT" && emp.salary>200);
        System.out.println("-----------------------");
        eT.filtraciyaRabotnikov(arrayList, emp -> emp.name.startsWith("E") && emp.salary!=450);
        System.out.println("-----------------------");
        eT.filtraciyaRabotnikov(arrayList, emp -> emp.name==emp.department);
        System.out.println("-----------------------");
    }
}