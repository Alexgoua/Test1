package Lesson27;

public class Test15 {
    void marafon(int temperaturaVozduxa, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("tempBega bil slishkov visokim: " + tempBega);
        }
        if (temperaturaVozduxa > 32) {
            throw new SveloMishcuException();
        }
        System.out.println("Vi uspeshno probegali marafon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(30, 13);
            }
        catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("V lubom sluchae vi poluchaete gramotu");
        }
    }
    class PodvernutNoguException extends Exception {
        PodvernutNoguException(String message) {
            super(message);
        }
        PodvernutNoguException() {};
    }
    class SveloMishcuException extends RuntimeException {
        SveloMishcuException(String message) {
            super(message);
        }
        SveloMishcuException() {};
    }
}
