abstract class Vehicle {
    String brand;
    String model;
    int year;
    int maxSpeed;
    double fuelConsumption;

    abstract double getFuelConsumption();

    abstract int getMaxSpeed();
}
