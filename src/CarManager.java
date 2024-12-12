import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private List<Car> cars;

    public CarManager() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(int carId) {
        cars.removeIf(car -> car.getId() == carId);
    }

    public boolean updateRentPrice(int carId, double newPrice) {
        for (Car car : cars) {
            if (car.getId() == carId) {
                car.setPricePerDay(newPrice);
                return true;
            }
        }
        return false;
    }

    public List<Car> getAvailableCars() {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAvailable()) {
                availableCars.add(car);
            }
        }
        return availableCars;
    }

    public List<Car> getRentedCars() {
        List<Car> rentedCars = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isAvailable()) {
                rentedCars.add(car);
            }
        }
        return rentedCars;
    }

    public Car findCarById(int carId) {
        for (Car car : cars) {
            if (car.getId() == carId) {
                return car;
            }
        }
        return null;
    }
}