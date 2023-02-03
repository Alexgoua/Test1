package Homework.Lesson5;

public class Employee {
    int ID;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int newID, String newSurname, int newAge, double newSalary, String newDepartment) {
        ID = newID;
        surname = newSurname;
        age = newAge;
        salary = newSalary;
        department = newDepartment;
    }

    void doubleSalary() {
        salary *= 2;
        System.out.println("Новая заплата сотрудника " + surname + ": " + salary + " долларов.");

    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Petrov", 25, 1000.0, "HR");
        Employee emp2 = new Employee(2, "Ivanov", 26, 1500.0, "IT");
        emp1.doubleSalary();
        emp2.doubleSalary();
    }
}
