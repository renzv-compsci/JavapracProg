// Create a base class Shape with a method of getArea()
// Create derived classes Circle, Rectangle, and Triangle that override getArea()
package polymorphism;

class Shape {
    public void getArea() {
        System.out.println("This calculates the area of shapes");
    }
}

class Circle extends Shape {

    double totalArea;
    double radius;

    public Circle(double radius) {
        this.radius= radius;
    }

    @Override 
    public void getArea() {

        totalArea = 3.14159 * (radius*radius);
        System.out.println("Circle's Area: " + totalArea);
    }
}

class Rectangle extends Shape {
    
    double totalArea;
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override 
    public void getArea() {

        totalArea = length * width;
        System.out.println("Rectangle's Area: " + totalArea);
    }
}

class Square extends Shape {

    double totalArea; 
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void getArea() {

        totalArea = side * side;
        System.out.println("Square's Area: " + totalArea);
    }
}

public class poly2 {
    public static void main(String[] args) {

        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(5, 15);
        Shape square = new Square(12);

        circle.getArea();
        System.out.println("");

        rectangle.getArea();
        System.out.println("");

        square.getArea();
        System.out.println("");
    }
}

