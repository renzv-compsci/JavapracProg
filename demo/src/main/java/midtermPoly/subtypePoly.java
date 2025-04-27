package midtermPoly;
/*Subtyping (Using Superclass Reference) Practice
Task:

Create a superclass Vehicle with a method drive().

Create subclasses Car and Bike that implement the drive() method.

In the main() method, create objects of Car and Bike, but use a Vehicle reference to call the drive() method.

Steps:

Create a superclass Vehicle with a drive() method.

Create Car and Bike subclasses that implement drive().

Use the Vehicle reference in the main() method to create objects of Car and Bike, then call the drive() method. */

class Vehicle {
    public void drive() {
        System.out.println("This vehicle drives");
    }
}

class Car extends Vehicle {
    
    @Override
    public void drive() {
        System.out.println("This car drives");
    }
}

class Bike extends Vehicle {

    @Override
    public void drive() {
        System.out.println("This bike drives");
    }
}

public class subtypePoly {
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.drive();
        bike.drive();
    }
}
