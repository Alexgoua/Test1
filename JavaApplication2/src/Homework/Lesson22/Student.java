package Homework.Lesson22;

public class Student {
    private StringBuilder name;
    public void setName(StringBuilder sb) {
        if (sb.length() > 2) {
            name = sb;
        }
    }
    public StringBuilder getName() {
        if (name == null) {
            return name;
        } else {
            return new StringBuilder(name);
        }
    }
    private int course;
    public void setCourse(int i) {
        if (i >=1 && i <=4) {
            course = i;
        }
    }
    public int getCourse() {
        return course;
    }
    private int grade;
    public void setGrade(int i) {
        if (i >=1 && i <= 10) {
            grade = i;
        }
    }
    public int getGrade() {
        return grade;
    }
    public void showInfo() {
        System.out.println("Student's name is " + getName());
        System.out.println("Student's course is " + getCourse());
        System.out.println("Student's grade is " + getGrade());
    }
}
class TestStudent {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("Iv"));
        s.setCourse(0);
        s.setGrade(8);
        s.showInfo();
    }
}