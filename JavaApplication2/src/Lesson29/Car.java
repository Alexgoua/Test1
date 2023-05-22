package Lesson29;
import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;
public class Car {
    String model;
    String color;
    double engine;
    Car(String mobel, String color, double engine) {
        this.model = mobel;
        this.color = color;
        this.engine = engine;
    }
    public String toString() {
        return "Our car is "+model+", color is "+color+" and engine = "+engine;
    }
}
class Test10 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> al = new ArrayList<>();
        for(int i = 0; i<3; i++) {
            al.add(carSupplier.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }
    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "silver metalic", 1.6));
        System.out.println("Our cars: "+ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 2.4;
            System.out.println("Updated car: "+car);
        });
        System.out.println("Our cars: "+ourCars);
    }
}