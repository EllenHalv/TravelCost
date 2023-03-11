import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int travelDistance = 200;
        double fuelPrice = 19.42;

        // create one model of each type (car, truck, motorcycle)
        List <Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("BMW", 10.0f, 130, 2020, "M5", 4));
        vehicles.add(new Truck("Scania", 35.0f, 110, 2019, "R450", 2, 2));
        vehicles.add(new Motorcycle("Yamaha", 4.5f, 160, 2022, "MT-07", false));
        vehicles.add(new Motorcycle("Harley-Davidson", 5.0f, 160, 2015, "Sportster", false));
        vehicles.add(new Car("Ford", 11.5f, 190, 2019, "Mustang", 2));


        System.out.println("Distance to travel: " + travelDistance + " km \nFuel price : " + fuelPrice + " kr/l");

        // print info about each model
        for (Vehicle vehicle : vehicles) {
            String price = String.format("%.2f", (vehicle.fuelConsumption * (travelDistance / 100) * fuelPrice));

            System.out.println("\n" + vehicle.brand + " " + vehicle.model + " (" + vehicle.year + ")" +
                    "\nFuel consumption: " + vehicle.fuelConsumption + " l/100 km" +
                    "\nMax speed: " + vehicle.maxSpeed + " km/h");
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Number of doors: " + car.getNumOfDoors() + "\nTravel distance: " + travelDistance + " km" +
                        "\nFuel needed: " + (vehicle.fuelConsumption * (travelDistance / 100)) + "l" + "\nPrice: " + price + " kr");


            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Number of doors: " + truck.getDoors() + "\nCapacity: " + truck.getCapacity() +
                        "\nTravel distance: " + travelDistance + " km" + "\nFuel needed: " + (vehicle.fuelConsumption * (travelDistance / 100)) + "l" + "\nPrice: " + price + " kr");


            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                System.out.print("Has windshield: ");
                System.out.print(motorcycle.hasWindShield() ? "True" : "False" + "\nTravel distance: " + travelDistance + " km" +
                        "\nFuel needed: " + (vehicle.fuelConsumption * (travelDistance / 100)) + "l" + "\nPrice: " + price + " kr\n");
            }
        }
        // find the cheapest alternative
        double cheapestPrice = Float.MAX_VALUE;
        String cheapestVehicle = "";

        for (Vehicle vehicle : vehicles) {
            float price = (float) ((vehicle.fuelConsumption * (travelDistance / 100) * fuelPrice));
            if (price < cheapestPrice) {
                cheapestPrice = price;
                cheapestVehicle = vehicle.brand + " " + vehicle.model + " (" + vehicle.year + ")";
            }
        }
        // print the cheapest alternative
        System.out.println("\n" + cheapestVehicle + " is the cheapest vehicle, with a cost of only " + String.format("%.2f", cheapestPrice) + " kr/per trip");
    }
}