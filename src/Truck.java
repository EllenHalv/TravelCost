public class Truck extends Vehicle {
    private int doors;
    private int capacity; // Lastkapaciteten (i ton)
    public Truck(String brand, float fuelConsumption, int maxSpeed, int year, String model, int doors, int capacity) {
        super.brand = brand;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
        super.year = year;
        super.model = model;
        this.doors = doors;
        this.capacity = capacity;
    }
    @Override
    float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDoors() {
        return doors;
    }
}
