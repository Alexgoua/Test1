package Homework.Lesson15;

public class Test1 {
    public static void main(String[] args) {
        int hour = -1;

        HOURS: while (hour < 24) {
            hour++;
            int minute = -1;
            MINUTES: do {
                minute++;
                int second = -1;
                SECONDS: while (second < 60) {
                    second++;
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            } while (minute < 60);
        }
    }
}
