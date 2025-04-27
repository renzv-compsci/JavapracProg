package midtermInheri;
/*Task: Create a base class Shape that has a method draw(). Create multiple subclasses like Circle and Rectangle 
that inherit from Shape and implement their own specific draw() method.

Steps to Implement:

Create the Shape class with a method draw().

Create the Circle class and override the draw() method to print a message about drawing a circle.

Create the Rectangle class and override the draw() method to print a message about drawing a rectangle. */

class Shape {
    public void draw() {
        System.out.println("This method draws shape");
    }
}

class Circle extends Shape {
    @Override 
    public void draw() {
        System.out.println("This method draws circle");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("This method draws rectangle");
    }
}

public class hierarchicalInheri {
    public static void main(String[] args) {
        
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();
    }
}
