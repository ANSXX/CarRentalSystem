public class Car {
    private static int idCounter = 0;

    private int id;
    private String model;
    private String type;
    private double rentalPricePerDay;
    private boolean available;

    public Car(String model, String type, double rentalPricePerDay, boolean available) {
        this.id = ++idCounter;
        this.model = model;
        this.type = type;
        this.rentalPricePerDay = rentalPricePerDay;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Car ID: " + id + ", Model: " + model + ", Type: " + type + ", Price/Day: " + rentalPricePerDay + ", Available: " + available;
    }
}
