import java.util.Scanner;

public class Admin {
    private final RentalService rentalService;

    public Admin(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. Add a New Car");
            System.out.println("2. Remove a Car");
            System.out.println("3. View Rental History");
            System.out.println("4. Logout");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addCar(scanner);
                case 2 -> removeCar(scanner);
                case 3 -> viewRentalHistory();
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addCar(Scanner scanner) {
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car type (e.g., SUV, Sedan, Hatchback): ");
        String type = scanner.nextLine();

        System.out.print("Enter rental price per day: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        Car car = new Car(model, type, price, true);
        rentalService.addCar(car);
        System.out.println("Car added successfully!");
    }

    private void removeCar(Scanner scanner) {
        System.out.print("Enter car ID to remove: ");
        int carId = scanner.nextInt();

        if (rentalService.removeCar(carId)) {
            System.out.println("Car removed successfully!");
        } else {
            System.out.println("Car ID not found. Please try again.");
        }
    }

    private void viewRentalHistory() {
        rentalService.displayRentalHistory();
    }
}
