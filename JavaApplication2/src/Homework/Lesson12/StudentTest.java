package Homework.Lesson12;
import Lesson8.Student;
public class StudentTest {
    static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты НЕ равны");
        }
    }
    static void method2(Student newSt1, Student newSt2) {
        if (!(newSt1.name.equals(newSt2.name))) {
            System.out.println("Имена разные");
        } else if (newSt1.course != newSt2.course) {
            System.out.println("Курсы разные");
        } else {
            System.out.println("Студенты равны");
        }
    }

    public static void main(String[] args) {
        //StudentTest st = new StudentTest(); - hasn't needed, because of static methods

        Student st01 = new Student("Ivan", 3);
        Student st02 = new Student("Petr", 3);
        Student st03 = new Student("Ivan", 2);
        Student st04 = new Student("Ivan", 3);
        System.out.println();

        method1(st01, st02);
        method1(st01, st03);
        method1(st01, st04);
        System.out.println();

        method2(st01, st02);
        method2(st01, st03);
        method2(st01, st04);

    }
}
