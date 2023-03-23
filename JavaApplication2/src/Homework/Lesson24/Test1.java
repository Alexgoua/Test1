package Homework.Lesson24;

public class Test1 {
    public static void main(String[] args) {
        Mechenosec mech1 = new Mechenosec("Ivan");
        System.out.println(mech1.name);
        mech1.eat();
        mech1.sleep();
        mech1.swim();
        System.out.println();

        Speakable s1 = new Pingvin("Petr");
        s1.speak();
        System.out.println();

        Animal a1 = new Lev("Igor");
        System.out.println(a1.name);
        a1.eat();
        a1.sleep();
        System.out.println();

        Mammal mam1 = new Lev("Kirill");
        System.out.println(mam1.name);
        mam1.eat();
        mam1.sleep();
        mam1.speak();
        mam1.run();
    }
}
abstract class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }
    @Override
    void sleep() {
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi!");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }
    abstract void fly();
    public void speak() {
        System.out.println(name + " sings");
    }
}
abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }
    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}
class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Pingvin lyubit est riby!");
    }
    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
    public void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }
    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi!");
    }
}
class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }
    public void eat() {
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }
    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }
    public void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }
}