public class Admin {
    private final String adminName;
    private final String password;
    private CarManager carManager;

    public Admin(String adminName, String password, CarManager carManager) {
        this.adminName = adminName;
        this.password = password;
        this.carManager = carManager;
    }

    public String getAdminName() {
        return adminName;
    }

    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
}
