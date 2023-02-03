package Homework.Lesson14;

public class Test1 {
    static void time() {
        Hours:
        for (int hour = 0; hour <= 6; hour++) {
            Minutes:
            for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute / 10 > 0 && minute % 10 == 0) {
                    break Hours;
                }
                Seconds:
                for (int second = 0; second <= 59; second++) {
                    System.out.println(hour + ":" + minute + ":" + second);
                    if (second * hour > minute) {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}