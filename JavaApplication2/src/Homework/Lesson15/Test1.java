package Homework.Lesson15;

public class Test1 {
    public static void main(String[] args) {
        int hour = -1;

        HOURS: while (hour < 5) {
            hour++;
            int minute = -1;
            MINUTES: do {
                if (hour > 1 && minute / 10 > 0 && minute % 10 == 0) {
                    break HOURS;
                }
                minute++;
                int second = -1;
                SECONDS: while (second < 59) {
                    second++;
                    System.out.println(hour + ":" + minute + ":" + second);
                    if (second * hour > minute) {
                        break;
                    }
                }
            } while (minute <59);
        }
    }
}
