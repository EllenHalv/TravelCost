public class Car extends Vehicle {
    private int doors;

    public Car(String brand, float fuelConsumption, int maxSpeed, int year, String model, int doors) {
        super.brand = brand;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
        super.year = year;
        super.model = model;
        this.doors = doors;
    }

    @Override
    float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    int getMaxSpeed() {
        return maxSpeed;
    }

    int getNumOfDoors() {
        return doors;
    }
}
