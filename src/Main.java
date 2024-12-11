import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalService rentalService = new RentalService();

        System.out.println("Welcome to the Car Rental System");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Admin Login");
            System.out.println("2. User Login");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Admin Username: ");
                    String adminUsername = scanner.nextLine();
                    System.out.print("Enter Admin Password: ");
                    String adminPassword = scanner.nextLine();

                    if (adminUsername.equals("admin") && adminPassword.equals("password")) {
                        System.out.println("\nAdmin Login Successful!");
                        Admin admin = new Admin(rentalService);
                        admin.showMenu();
                    } else {
                        System.out.println("Invalid credentials. Please try again.");
                    }
                }

                case 2 -> {
                    System.out.print("Enter your name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String userEmail = scanner.nextLine();

                    Customer customer = new Customer(userName, userEmail);
                    System.out.println("\nWelcome, " + userName + "!");
                    customer.showMenu(rentalService);
                }

                case 3 -> {
                    System.out.println("Thank you for using the Car Rental System. Goodbye!");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
