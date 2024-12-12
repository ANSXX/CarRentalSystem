import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalService rentalService = new RentalService();
        Admin admin = new Admin(rentalService, "admin", "password123");
        CustomerManager customerManager = new CustomerManager();
        CarManager carManager = new CarManager();

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Enter command: login, addcustomer, addcar, or exit:");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "login":
                    System.out.print("Enter admin name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();

                    if (admin.getAdminName().equals(name) && admin.verifyPassword(password)) {
                        System.out.println("Login successful!");
                        admin.viewAllCustomers(customerManager);
                    } else {
                        System.out.println("Login failed.");
                    }
                    break;

                case "addcustomer":
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter customer ID: ");
                    int customerId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter contact: ");
                    String contact = scanner.nextLine();
                    customerManager.addCustomer(new Customer(customerId, customerName, contact, "default_email"));
                    break;

                case "addcar":
                    System.out.print("Enter car ID: ");
                    int carId = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    carManager.addCar(new Car(carId, model, "Red", 50000.0, true));
                    break;

                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
        scanner.close();
    }
}
