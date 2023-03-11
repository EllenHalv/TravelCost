public class Motorcycle extends Vehicle {
    private boolean windShield;
    public Motorcycle(String brand, float fuelConsumption, int maxSpeed, int year, String model, boolean windShield) {

        super.brand = brand;
        super.fuelConsumption = fuelConsumption;
        super.maxSpeed = maxSpeed;
        super.year = year;
        super.model = model;
        this.windShield = windShield;
    }
    @Override
    float getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean hasWindShield() {
        return windShield;
    }
}
