package Lesson8;

public class Student {
    public String name;
    public int course;
    static int count;
    int a;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");

    }
    public static void showCount() {
        System.out.println("Vsego sozdano studentov: " + count);
    }
    public void showInfo() {
        System.out.println("Welcome to the Student class!");
    }
    void abc() {
        a++;
        count++;
    }
    static void abcd() {
        count++;
        // a++;
        Student st1 = new Student("Sidor", 5);
        st1.a++;
    }
}
class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Petr", 4);
        Student st3 = new Student("Masha", 3);

        System.out.println(st1.name);
        System.out.println(Student.count);
        Student.showCount();
        Student.abcd();
        // Student.abc();

    }
}
