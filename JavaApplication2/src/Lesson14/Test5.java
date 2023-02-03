package Lesson14;

public class Test5 {
    public void time() {
        Outer: for (int chas = 0; chas <= 23; chas++) { //this loop is named with label "Outer"
            Inner: for (int minuta = 0; minuta <= 59; minuta++) { //this loop is named with label "Inner"
                System.out.println(chas + ":" + minuta);
                if (minuta == 30) {
                    break Outer;
                }
            }
        }
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        t.time();
    }
}
