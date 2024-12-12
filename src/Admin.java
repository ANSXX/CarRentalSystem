public class Admin {
    private String name;
    private String password;
    private RentalService rentalService;

    public Admin(RentalService rentalService, String name, String password) {
        this.rentalService = rentalService;
        this.name = name;
        this.password = password;
    }

    public String getAdminName() {
        return name;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public void viewAllCustomers(CustomerManager customerManager) {
        System.out.println("Viewing all customers:");
        customerManager.listAllCustomers();
    }
}
