abstract class Vehicle {
    
    String brand;
    String model;
    int year;
    int maxSpeed;
    float fuelConsumption;

    abstract float getFuelConsumption();

    abstract int getMaxSpeed();
}
