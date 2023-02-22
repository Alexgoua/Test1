package Lesson22;

public class Chelovek {
    final String pol;
    public Chelovek(String pol) {
        this.pol = pol;
    }
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String s) {
        name = s;
    }

    private int vozrast;
    public int getVozrast() {
        return vozrast;
    }
    public void setVozrast(int i) {
        if (i > 0) {
            vozrast = i;
        }
    }

    private int ves;
    public int getVes() {
        return ves;
    }
    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }
    private boolean clever;
    public boolean isClever() {
        return clever;
    }
    public void setClever(boolean c) {
        clever = c;
    }
}
class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
//        c.name = "Petya";
//        c.vozrast = 25;
//        c.ves = 65;
        c.setName("Kolya");
        c.setVozrast(15);
        c.setVes(50);
        System.out.println(c.getName());
        System.out.println(c.getVozrast());
        System.out.println(c.getVes());
    }
}
