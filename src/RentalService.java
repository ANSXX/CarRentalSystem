import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RentalService {
    private final List<Car> cars;
    private final HashMap<Integer, String> rentalHistory;

    public RentalService() {
        this.cars = new ArrayList<>();
        this.rentalHistory = new HashMap<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public boolean removeCar(int carId) {
        return cars.removeIf(car -> car.getId() == carId);
    }

    public void displayAvailableCars() {
        System.out.println("\nAvailable Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
            }
        }
    }

    public boolean rentCar(int carId, String customerName) {
        for (Car car : cars) {
            if (car.getId() == carId && car.isAvailable()) {
                car.setAvailable(false);
                rentalHistory.put(carId, customerName);
                return true;
            }
        }
        return false;
    }

    public boolean returnCar(int carId) {
        for (Car car : cars) {
            if (car.getId() == carId && !car.isAvailable()) {
                car.setAvailable(true);
                rentalHistory.remove(carId);
                return true;
            }
        }
        return false;
    }

    public void displayRentalHistory() {
        System.out.println("\nRental History:");
        if (rentalHistory.isEmpty()) {
            System.out.println("No rental history available.");
        } else {
            rentalHistory.forEach((carId, customerName) -> {
                System.out.println("Car ID: " + carId + ", Rented by: " + customerName);
            });
        }
    }
}
