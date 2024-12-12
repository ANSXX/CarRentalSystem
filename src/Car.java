public class Car {
    private int carId;
    private String model;
    private String manufacturer;
    private double pricePerDay;
    private boolean available;

    public Car(int carId, String model, String manufacturer, double pricePerDay, boolean available) {
        this.carId = carId;
        this.model = model;
        this.manufacturer = manufacturer;
        this.pricePerDay = pricePerDay;
        this.available = available;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Override toString for better representation
    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", available=" + available +
                '}';
    }
}
