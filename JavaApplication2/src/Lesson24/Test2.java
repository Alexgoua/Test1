package Lesson24;

public class Test2 {
}
abstract class Figura {
//    Figura (int kolichestvoStoron) {
//        this.kolichestvoStoron = kolichestvoStoron;
//    }
    int kolichestvoStoron = 0;
    abstract void perimetr();
    abstract void ploshad();
    void showInfo() {
        System.out.println("Eto figura");
    }

}
class Kvadrat extends Figura {
//    Kvadrat(int kolichestvoStoron) {
//        super(kolichestvoStoron);
//        this.kolichestvoStoron = kolichestvoStoron;
//    }
    int kolichestvoStoron = 4;
    int storona1 = 10;
    public void perimetr() {
        System.out.println("Perimetr kvadrata = " + storona1*4);
    }
    public void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1*storona1);
    }
}
class Pryamougolnik extends Figura {
    int kolichestvoStoron = 4;
    int storona1 = 8;
    int storona2 = 5;
    public void perimetr() {
        System.out.println("Perimetr pryamougolnika = " + (storona1 + storona2) * 2);
    }
    public void ploshad() {
        System.out.println("Ploshad pryamougolnika = " + storona1*storona2);
    }
}
class Okrujnost extends Figura {
    int kolichestvoStoron = 0;
    int radius = 3;
    public void perimetr() {
        System.out.println("Perimetr okrujnosti = " + 2 * 3.14 * radius);
    }
    public void ploshad() {
        System.out.println("Ploshad okrujnosti = " + 3.14 * radius * radius);
    }
}
abstract class Chetirehugolnik extends Figura {
    void def() {
        System.out.println("Eto chetirehugolnik");
    }
}