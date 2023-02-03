package Homework.Lesson4;

 public class Student {
    int number;
    String name;
    String surname;
    int year;
    double math;
    double ecomony;
    double language;

    static void sredneeAryphm(Student student) {
       System.out.println("Средняя оценка студента " + student.name + ": " + (student.math + student.ecomony + student.language) / 3);
    }
}

