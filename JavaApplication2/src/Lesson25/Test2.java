package Lesson25;

public class Test2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();

        if (j instanceof Jumpable) {
            System.out.println("J is Jumpable");
        }
        if (m instanceof Human) {
            System.out.println("m is Human");
        }
//        if (s instanceof Human) {
//            System.out.println("s is Human");
//        } - компилятор не пускает, так как связи is-A нет у Student и Human, и у sub-классов Student тоже быть не может
        if (s instanceof Jumpable) {
            System.out.println("s is Jumpable");
       } // компилятор пропускает, так как sub-класс МОЖЕТ имплементировать Jumpable
    }
}
interface Jumpable {

}
class Human implements Jumpable{}
class Man extends Human{}
class Student{}
