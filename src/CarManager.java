import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Car added: " + car);
    }

    public void listAllCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            cars.forEach(System.out::println);
        }
    }
}
