package Lesson22.p1;
import Lesson22.Chelovek;
public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolya");
        c.setVozrast(15);
        c.setVes(50);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
