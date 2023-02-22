package Homework.Lesson20;

public class Test2 {
    public static void main(String[] args) {
        int speed1 = 5000;
        int speed2 = 4000;
        int speedDog = 8000;
        double distance = 18000.0;
        int count = 0;
        double time = 0.0;
        double passedDist = 0.0;
        double wholeTime = 0.0;
        double meeting = 0.0;

        while (distance > meeting) {
            if (count % 2 == 0) {
                time = distance / (speed2 + speedDog);
                passedDist = time * (speed1 + speed2);
            } else {
                time = distance / (speed1 + speedDog);
                passedDist = time * (speed1 + speed2);
            }
            distance -= passedDist;
            count++;
            wholeTime+=time;
            System.out.println("Цикл-" + count + " Растояние между людьми(м): " + distance + " Время цикла(час): " + time);
        }
        System.out.println();
        System.out.println("Итого, если считать за встречу растояние в " + meeting + " (или меньше) метров: ");
        System.out.println("Cобака пробежала туда-сюда " + count + " раз.");
        System.out.println("Это заняло часов: " + wholeTime + ". (по-нормальному это " + Math.round(wholeTime) + " часа).");
        System.out.println("Собака всего пробежала " + wholeTime * speedDog + " метров (по-нормальному - " +
                Math.round(wholeTime * speedDog / 1000) + " км.).");
    }
}