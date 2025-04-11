package inheritance;

class Vehicle {
    
    String brand;
    int model;
    double rentalPrice;

    public Vehicle(String brand, int model, double rentalPrice) {

        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;

    }

    public void displayDetails() {
    
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Rental Price: " + rentalPrice);
    }
}

class Car extends Vehicle {

    int numDoors; 

    public Car (String brand, int model, double rentalPrice, int numDoors) {
        super(brand, model, rentalPrice);
        this.numDoors = numDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class ElectricCar extends Car {

    String batteryCapacity;

    public ElectricCar(String brand, int model, double rentalPrice, int numDoors, String batteryCapacity) {
        super(brand, model, rentalPrice, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity);
    }
}

public class Inheri3 {
    public static void main (String[] args) {

        Car car = new Car("Toyota", 2025, 1000, 4);
        ElectricCar elecCar = new ElectricCar("Tesla", 2024, 5000, 3, "82 kWh");

        System.out.println("Non-Electric Car info:");
        car.displayDetails();

        System.out.println("\nElectic Car info:");
        elecCar.displayDetails();

    }
}