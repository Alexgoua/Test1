package Lesson29;
import java.util.ArrayList;
import java.util.function.*;
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();
        Student1 st1 = new Student1("Ivan", 'm', 22, 3, 8.3);
        Student1 st2 = new Student1("Nikolay", 'm', 28, 2, 6.4);
        Student1 st3 = new Student1("Elena", 'f', 19, 1, 8.9);
        Student1 st4 = new Student1("Petr", 'm', 35, 4, 7);
        Student1 st5 = new Student1("Mariya", 'f', 23, 3, 9.1);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo1 si = new StudentInfo1();

        si.testStudents(list, (Student1 st) -> {return st.avgGrade > 8.5;}); //полный вариант lambda-выражения
        System.out.println("-----------------------------------");
        si.testStudents(list, st -> st.avgGrade < 9); //короткий вариант lambda-выражения
        System.out.println("-----------------------------------");
        si.testStudents(list, st -> {return st.age > 25;}); //смешанный вариант написания
        System.out.println("-----------------------------------");
        si.testStudents(list, (Student1 st) -> st.age < 27); //смешанный вариант написания
        System.out.println("-----------------------------------");
        si.testStudents(list, (Student1 st) -> {return st.sex == 'm';});
        System.out.println("-----------------------------------");
        si.testStudents(list, (Student1 st) -> {return st.avgGrade > 8.5 && st.age < 23 && st.sex=='f';});
        System.out.println("-----------------------------------");

        for(Student1 s: list) {
            System.out.println(s.name);
        }
        System.out.println("---------------");
        list.removeIf(x->x.name.endsWith("a"));
        for(Student1 s: list) {
            System.out.println(s.name);
        }
    }
}
class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
    Student1(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}
class StudentInfo1 {
    void printStudent(Student1 st) {
        System.out.println("Student's name: "+st.name+", sex: "+st.sex+", age: "+st.age+", course: "+st.course
                +", average grade: "+st.avgGrade);
    }
    void testStudents(ArrayList <Student1> aL, Predicate<Student1> t) {
        for (Student1 s: aL) {
            if(t.test(s)) {
                printStudent(s);
            }
        }
    }
}
//interface StudentChecks1 {
//    boolean test(Student1 s);
//}