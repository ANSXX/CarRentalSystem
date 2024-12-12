import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarManager carManager = new CarManager();
        RentalService rentalService = new RentalService();
        Admin admin = new Admin("admin", "password", carManager); // Replace with your credentials
        boolean isLoggedIn = false;

        System.out.println("Welcome to the Car Rental System!");

        while (!isLoggedIn) {
            System.out.println("\nPlease log in to continue.");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (admin.getAdminName().equals(username) && admin.verifyPassword(password)) {
                System.out.println("Login successful!");
                isLoggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }

        // Main menu
        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View Available Cars");
            System.out.println("2. View Rented Cars");
            System.out.println("3. Add a Car");
            System.out.println("4. Remove a Car");
            System.out.println("5. Update Rent Price");
            System.out.println("6. Rent a Car");
            System.out.println("7. Return a Car");
            System.out.println("8. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Available Cars:");
                    carManager.getAvailableCars().forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Rented Cars:");
                    carManager.getRentedCars().forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Enter Car ID: ");
                    int carId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Car Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Car Brand: ");
                    String brand = scanner.nextLine();
                    System.out.print("Enter Price Per Day: ");
                    double pricePerDay = scanner.nextDouble();
                    scanner.nextLine();

                    carManager.addCar(new Car(carId, model, brand, pricePerDay, true));
                    System.out.println("Car added successfully!");
                    break;
                case 4:
                    System.out.print("Enter Car ID to Remove: ");
                    int removeCarId = scanner.nextInt();
                    scanner.nextLine();

                    carManager.removeCar(removeCarId);
                    System.out.println("Car removed successfully!");
                    break;
                case 5:
                    System.out.print("Enter Car ID to Update Rent Price: ");
                    int updateCarId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Rent Price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine();

                    if (carManager.updateRentPrice(updateCarId, newPrice)) {
                        System.out.println("Rent price updated successfully!");
                    } else {
                        System.out.println("Failed to update rent price. Car ID not found.");
                    }
                    break;
                case 6:
                    System.out.print("Enter Car ID to Rent: ");
                    int rentCarId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = scanner.nextLine();

                    if (rentalService.rentCar(rentCarId, customerName)) {
                        System.out.println("Car rented successfully!");
                    } else {
                        System.out.println("Failed to rent car. Car might not be available.");
                    }
                    break;
                case 7:
                    System.out.print("Enter Car ID to Return: ");
                    int returnCarId = scanner.nextInt();
                    scanner.nextLine();

                    if (rentalService.returnCar(returnCarId)) {
                        System.out.println("Car returned successfully!");
                    } else {
                        System.out.println("Failed to return car. Car ID not found.");
                    }
                    break;
                case 8:
                    System.out.println("Logged out successfully. Exiting...");
                    isLoggedIn = false;
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
