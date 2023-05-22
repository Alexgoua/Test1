package Homework.Lesson28;
import java.time.*;
import java.time.format.*;
public class Test1 {
    public static void main(String[] args) {
        DataIVremya nedelya = new DataIVremya();
        LocalDateTime ldt1 = LocalDateTime.of(2016, 1, 1, 9, 0);
        LocalDateTime ldt2 = LocalDateTime.of(2016, 2, 3, 9, 0);
        Period p1 = Period.ofDays(5);
        Duration d1 = Duration.ofDays(2);

        nedelya.smena(ldt1, ldt2, p1, d1);
    }
}
class DataIVremya {
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");
    void smena(LocalDateTime start, LocalDateTime end, Period p, Duration d) {
        while (start.isBefore(end)) {
            System.out.print("Работаем с: " + start.format(dtf1) + ". ");
            start = start.plus(p);
            System.out.println("До: " + start.format(dtf1) + ".");
            System.out.print("Отдыхаем с: " + start.format(dtf2) + ". ");
            start = start.plus(d);
            System.out.println("До: " + start.format(dtf2) + ".");
            System.out.println();
        }
    }
}