import java.util.ArrayList;
import java.util.List;

public class RentalService {
    private List<RentalRecord> rentalRecords;

    public RentalService() {
        this.rentalRecords = new ArrayList<>();
    }

    // Rent a car to a customer
    public boolean rentCar(Customer customer, Car car) {
        if (car.isAvailable()) {
            car.setAvailable(false);
            RentalRecord record = new RentalRecord(customer, car);
            rentalRecords.add(record);
            System.out.println("Car rented successfully: " + car);
            return true;
        } else {
            System.out.println("Car is not available for rent: " + car);
            return false;
        }
    }

    // Return a car
    public boolean returnCar(Customer customer, Car car) {
        for (RentalRecord record : rentalRecords) {
            if (record.getCar().equals(car) && record.getCustomer().equals(customer)) {
                car.setAvailable(true);
                rentalRecords.remove(record);
                System.out.println("Car returned successfully: " + car);
                return true;
            }
        }
        System.out.println("No rental record found for this car and customer.");
        return false;
    }

    // List all rental records
    public void listRentalRecords() {
        if (rentalRecords.isEmpty()) {
            System.out.println("No active rentals found.");
        } else {
            System.out.println("Active Rental Records:");
            for (RentalRecord record : rentalRecords) {
                System.out.println(record);
            }
        }
    }
}
