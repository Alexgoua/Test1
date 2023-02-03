package Lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("ponedelnik") {
            case "ponedelnik":
                //System.out.println("Rabota do 18:00");
                //break;
            case "vtornik":
                //System.out.println("Rabota do 18:00");
                //break;
            case "sreda":
                //System.out.println("Rabota do 18:00");
                //break;
            case "chetverg":
                // System.out.println("Rabota do 18:00");
                //break;
            case "pyatnica":
                System.out.println("Rabota do 18:00");
                break;
            case "subota":
                System.out.println("Rabota do 14:00");
                break;
            case "voskresenie":
                System.out.println("Raboti net");
                break;
            default:
                System.out.println("takogo dnya ne sushestvuet");
        }
    }
}
