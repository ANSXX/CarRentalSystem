public class Car {
    private int id;
    private String model;
    private String brand;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(int id, String model, String brand, double pricePerDay, boolean isAvailable) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public String toString() {
        return "Car [ID=" + id + ", Model=" + model + ", Brand=" + brand + ", PricePerDay=" + pricePerDay + ", Available=" + isAvailable + "]";
    }
}