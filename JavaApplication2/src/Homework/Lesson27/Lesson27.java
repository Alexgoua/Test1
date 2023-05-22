package Homework.Lesson27;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try{
            t.drink("voda");
            try {
                t.drink("pivo");
            }
            catch (NeVodaException e) {
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Eto inner finally block");
            }
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String s) {
        super(s);
    }
}
class NeVodaException extends Exception {
    NeVodaException(String s) {
        super(s);
    }
}
class Tiger {
    void eat(String s) {
        if (!s.equals("myaso")) {
            throw new NeMyasoException("Tigr ne est " + s);
        }
        System.out.println("Tigr est myaso");
    }
    void drink(String s) throws NeVodaException{
        if (!s.equals("voda")) {
            throw new NeVodaException("Tigr ne pyet " + s);
        }
        System.out.println("Tigr pyet vodu");
    }
}
