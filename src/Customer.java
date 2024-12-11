import java.util.Scanner;

public class Customer {
    private final  String name;
    private final  String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showMenu(RentalService rentalService) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCustomer Menu:");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Logout");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> rentalService.displayAvailableCars();
                case 2 -> rentCar(scanner, rentalService);
                case 3 -> returnCar(scanner, rentalService);
                case 4 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void rentCar(Scanner scanner, RentalService rentalService) {
        System.out.print("Enter the Car ID to rent: ");
        int carId = scanner.nextInt();
        scanner.nextLine(); 

        if (rentalService.rentCar(carId, name)) {
            System.out.println("Car rented successfully!");
        } else {
            System.out.println("Car ID not available or already rented. Please try again.");
        }
    }

    private void returnCar(Scanner scanner, RentalService rentalService) {
        System.out.print("Enter the Car ID to return: ");
        int carId = scanner.nextInt();
        scanner.nextLine(); 

        if (rentalService.returnCar(carId)) {
            System.out.println("Car returned successfully! Thank you.");
        } else {
            System.out.println("Invalid Car ID or car not rented by you. Please try again.");
        }
    }
}
