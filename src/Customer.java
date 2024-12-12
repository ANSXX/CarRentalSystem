public class Customer {
    private int customerId;
    private String name;
    private String contact;
    private String email;

    public Customer(int customerId, String name, String contact, String email) {
        this.customerId = customerId;
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name + ", Contact: " + contact + ", Email: " + email;
    }
}
