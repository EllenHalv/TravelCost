public class Truck extends Vehicle {
    private int doors;
    private int capacity;
    public Truck(String brand, double fuelConsumption, int maxSpeed, int year, String model, int doors, int capacity) {
        super.brand = brand;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
        super.year = year;
        super.model = model;
        this.doors = doors;
        this.capacity = capacity;
    }
    @Override
    double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    int getMaxSpeed() {
        return maxSpeed;
    }
}
