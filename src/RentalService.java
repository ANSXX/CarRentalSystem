public class RentalService {
    private CarManager carManager;

    public RentalService() {
        this.carManager = new CarManager();
    }

    public boolean rentCar(int carId, String customerName) {
        Car car = carManager.findCarById(carId);
        if (car != null && car.isAvailable()) {
            car.setAvailable(false);
            System.out.println("Car rented to " + customerName);
            return true;
        }
        return false;
    }

    public boolean returnCar(int carId) {
        Car car = carManager.findCarById(carId);
        if (car != null && !car.isAvailable()) {
            car.setAvailable(true);
            System.out.println("Car returned successfully.");
            return true;
        }
        return false;
    }
}