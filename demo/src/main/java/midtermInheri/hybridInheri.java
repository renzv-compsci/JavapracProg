package midtermInheri;
/*Multiple Inheritance (Using Interfaces)
Task: Create two interfaces, Flyable and Swimmable. Implement both interfaces in a class Duck, and provide 
implementations for both fly() and swim() methods.

Steps to Implement:

Create the Flyable interface with a method fly().

Create the Swimmable interface with a method swim().

Create the Duck class that implements both interfaces and provides implementations for fly() and swim() methods.

 */

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("The duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("But the duck can also swim");
    }
}

public class hybridInheri {
    public static void main(String[] args) {
        
        Duck duck = new Duck();

        duck.fly();
        duck.swim();
    }
}
