package midtermInheri;
/*Task: Create a base class Animal, a subclass Mammal that extends Animal, and a subclass Dog that extends Mammal.
The Dog class should add a method to display specific behaviors of dogs (like barking).

Steps to Implement:

Create the Animal class with a method eat().

Create the Mammal class that inherits from Animal and adds a method sleep().

Create the Dog class that inherits from Mammal and adds a method bark(). */

class Animal {
    public void eat() {
        System.out.println("The animal eats");
    }
}

class Mammal extends Animal {

    public void sleep() {
        System.out.println("The mammal sleeps");
    }
}

class Dog extends Mammal {

    public void bark() {
        System.out.println("The dog barks");
    }
}

public class multilevelInheri {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();

        animal.eat();
        mammal.sleep();
        dog.bark();

    }
}
