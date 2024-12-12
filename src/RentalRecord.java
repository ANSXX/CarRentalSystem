public class RentalRecord {
    private Customer customer;
    private Car car;

    public RentalRecord(Customer customer, Car car) {
        this.customer = customer;
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Customer: " + customer + ", Car: " + car;
    }
}
