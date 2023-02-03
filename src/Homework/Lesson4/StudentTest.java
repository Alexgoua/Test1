package Homework.Lesson4;

import Homework.Lesson4.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.number = 1;
        student1.name = "Ivan";
        student1.surname = "Ivanov";
        student1.year = 2003;
        student1.math = 3.5;
        student1.ecomony = 3.8;
        student1.language = 4.5;

        student2.number = 2;
        student2.name = "Petr";
        student2.surname = "Petrov";
        student2.year = 2004;
        student2.math = 3.8;
        student2.ecomony = 3.3;
        student2.language = 4.1;

        student3.number = 3;
        student3.name = "Sidor";
        student3.surname = "Sidorov";
        student3.year = 2002;
        student3.math = 4.8;
        student3.ecomony = 3.9;
        student3.language = 4.0;

        Student.sredneeAryphm(student1);
        Student.sredneeAryphm(student2);
        Student.sredneeAryphm(student3);
    }
}
