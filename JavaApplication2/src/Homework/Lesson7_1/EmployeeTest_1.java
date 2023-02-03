package Homework.Lesson7_1;


public class EmployeeTest_1 {
    public static void main(String[] args) {
        Homework.Lesson7.Employee emp1 = new Homework.Lesson7.Employee("Ivanov", 21);
        emp1.showID();
        emp1.showSurname();
        emp1.showSalary();

        /*
        Homework.Lesson7.Employee emp2 = new Homework.Lesson7.Employee(1, "Petrov", 25);
        emp2.showID();
        emp2.showSurname();
        emp2.showSalary();
        Homework.Lesson7.Employee emp3 = new Homework.Lesson7.Employee(2, "Sidorov", 23, 1000.0, "IT");
        emp3.showID();
        emp3.showSurname();
        emp3.showSalary();
        */

        System.out.println();
        //System.out.println(emp1.ID);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);

        System.out.println();
        /*
        System.out.println(emp2.ID);
        System.out.println(emp2.surname);
        System.out.println(emp2.salary);
        */

        System.out.println();
        /*
        System.out.println(emp3.ID);
        System.out.println(emp3.surname);
        System.out.println(emp3.salary);
        */
    }
}
