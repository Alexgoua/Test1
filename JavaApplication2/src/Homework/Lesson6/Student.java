package Homework.Lesson6;

public class Student {
    int number;
    String name;
    String surname;
    int year;
    double math;
    double ecomony;
    double language;

    Student(int newNumber, String newName, String newSurname, int newYear, double newMath, double newEconomy, double newLanguage) {
        number = newNumber;
        name = newName;
        surname = newSurname;
        year = newYear;
        math = newMath;
        ecomony = newEconomy;
        language = newLanguage;
    }
    Student(int newNumber, String newName, String newSurname, int newYear) {
        this(newNumber, newName, newSurname, newYear, 0.0, 0.0, 0.0);
    }
    Student() {}
    void showInfo() {
        System.out.println(number);
        System.out.println(name);
        System.out.println(surname);
        System.out.println(year);
        System.out.println(math);
        System.out.println(ecomony);
        System.out.println(language);
        System.out.println();
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(1, "Ivan", "Ivanov", 2004);
        Student st3 = new Student(2, "Petr", "Petrov", 2006, 3.4, 4.9, 3.9);
        st1.showInfo();
        st2.showInfo();
        st3.showInfo();
    }
}
