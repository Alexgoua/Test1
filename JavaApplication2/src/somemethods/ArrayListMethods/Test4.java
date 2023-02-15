package somemethods.ArrayListMethods;

import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Michail");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Sidorova Maria");
        map.put(780, "Petrov Petr");
        System.out.println("map = " + map);
        map.put(779, "Roberto Carlos");
        System.out.println("map = " + map);
        map.put(781, "Petrov Petr");
        System.out.println("map = " + map);

        map.remove(779);
        System.out.println("map = " + map);

    }
}
