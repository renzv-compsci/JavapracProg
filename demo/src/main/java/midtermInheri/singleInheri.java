package midtermInheri;

/*Task: Create a base class Vehicle that has properties like brand and speed. Create a subclass Car that inherits 
from Vehicle, and add an additional property like model to the Car class. Implement a method in both classes to 
display the details.

Steps to Implement:

Create the Vehicle class with properties like brand and speed.

Create the Car class that extends Vehicle and adds a new property model.

Add methods to display vehicle details in both classes. */

class Vehicle {
    String brand;
    String speed;

    public Vehicle (String brand, String speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Speed: " + speed);
    }
}

class Car extends Vehicle  {
    String model;
    int year;

    public Car (String brand, String speed, String model, int year) {
        super(brand, speed);
        this.model = model;
        this.year = year; 
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Model: " + model);
        System.out.println("Car year: " + year);
    }
}

public class singleInheri {
    public static void main(String[] args) {
        
        Vehicle car = new Car("Toyota", "150kpmh" , "Corolla", 2020);

        car.displayInfo();
    }
}