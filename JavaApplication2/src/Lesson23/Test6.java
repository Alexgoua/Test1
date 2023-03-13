package Lesson23;

public class Test6 {
}
class Animal1 {
    String showName() {
        return "someAnimal";
    }
    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }
}
class Mouse1 extends Animal1 {
    String showName() {
        return "mouse";
    }

    public static void main(String[] args) {
        Animal1 a = new Mouse1();
        a.showInfo();
        Animal1 a1 = new Animal1();
        a1.showInfo();
    }
}