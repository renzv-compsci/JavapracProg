package midtermPoly;
/*Subclassing (Method Overriding) Practice
Task:

Create a superclass Animal with a method makeSound().

Create subclasses Dog and Cat that override the makeSound() method.

Each subclass should print a different sound ("Bark" for the dog and "Meow" for the cat).

Steps:

Create a base class Animal with a method makeSound().

Create Dog and Cat subclasses that override makeSound().

In the main() method, create objects of both subclasses and call the makeSound() method. */

class Animal {
    public void makeSound() {
        System.out.println("This animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class subclassPoly {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}