import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer);
    }

    public void removeCustomer(int customerId) {
        customers.removeIf(customer -> customer.getCustomerId() == customerId);
        System.out.println("Customer removed with ID: " + customerId);
    }

    public void listAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            customers.forEach(System.out::println);
        }
    }
}
