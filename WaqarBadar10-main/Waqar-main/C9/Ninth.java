package C9;

// Q9) Write a Java program to create a vehicle class hierarchy. 
// The base class should be Vehicle, with subclasses Truck, Car, and Motorcycle. 
// Each subclass should have properties such as make, model, year, and fuel type. 
// Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    double calculateFuelEfficiency(double distance, double fuelConsumed) {
        return distance / fuelConsumed;
    }

    double calculateDistance(double fuelConsumed, double fuelEfficiency) {
        return fuelConsumed * fuelEfficiency;
    }

    double calculateMaxSpeed() {
        return 100.0; // Default speed for base vehicle
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(String make, String model, int year, String fuelType, double loadCapacity) {
        super(make, model, year, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    double calculateMaxSpeed() {
        return 80.0; // Truck typically has lower max speed
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String make, String model, int year, String fuelType, int numDoors) {
        super(make, model, year, fuelType);
        this.numDoors = numDoors;
    }

    @Override
    double calculateMaxSpeed() {
        return 120.0; // Cars generally have higher max speed
    }
}

class Motorcycle extends Vehicle {
    boolean hasSidecar;

    Motorcycle(String make, String model, int year, String fuelType, boolean hasSidecar) {
        super(make, model, year, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    double calculateMaxSpeed() {
        return 150.0; // Motorcycles can go even faster
    }
}

public class Ninth {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2022, "Diesel", 2000);
        Car car = new Car("Honda", "Civic", 2021, "Petrol", 4);
        Motorcycle motorcycle = new Motorcycle("Harley", "Iron 883", 2020, "Petrol", false);

        System.out.println("Truck Max Speed: " + truck.calculateMaxSpeed());
        System.out.println("Car Max Speed: " + car.calculateMaxSpeed());
        System.out.println("Motorcycle Max Speed: " + motorcycle.calculateMaxSpeed());
    }
}
/* Truck Max Speed: 80.0
Car Max Speed: 120.0
Motorcycle Max Speed: 150.0
PS C:\Users\ambuj\Desktop\OOps TA> */
