package Homework.Lesson7;

public class Employee {
    int ID;
    public String surname;
    int age;
    private double salary;
    String department;

    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);

    }
    public Employee(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }
    private Employee(int id4, String surname4, int age4, double salary4, String department4) {
        ID = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }
    public void showID() {
        System.out.println(ID);
    }
    public void showSurname() {
        System.out.println(surname);
    }
    public void showSalary() {
        System.out.println(salary);
    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivanov", 21);
        emp1.showID();
        emp1.showSurname();
        emp1.showSalary();

        Employee emp2 = new Employee(1, "Petrov", 25);
        emp2.showID();
        emp2.showSurname();
        emp2.showSalary();

        /*Employee emp3 = new Employee(2, "Sidorov", 23, 1000.0, "IT");
        emp2.showID();
        emp2.showSurname();
        emp2.showSalary();
        System.out.println();
        System.out.println(emp1.ID);
        System.out.println(emp1.surname);
        System.out.println(emp1.salary);*/

        System.out.println();
        System.out.println(emp2.ID);
        System.out.println(emp2.surname);
        ///System.out.println(emp2.salary);

        System.out.println();
        /*System.out.println(emp3.ID);
        System.out.println(emp3.surname);
        System.out.println(emp3.salary);*/
    }
}
