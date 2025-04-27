package midtermEncap;

/*Practice 3: Rectangle
Create a class called Rectangle with the following private fields:

length (double)

width (double)

The class should include:

A getter and setter for each field (length, width).

A method to calculate the area of the rectangle (using the formula: length * width).

A method to calculate the perimeter of the recta ngle (using the formula: 2 * (length + width)). */

public class Rectangle {
    private double length;
    private double width;
    private double result;

    // setter for the Rectangle's info
    public void rectInfo(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // setter with method to calculate the area of the rectangle 
    public void calcArea() {
        result = length * width;
    }

    // setter with method to calculate the area of the rectangle 
    public void calcPerimeter() {
        result = 2 * (length + width);
    }

    // getter methods 
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
        
        Rectangle rect = new Rectangle();
        rect.rectInfo(50, 35.2);

        rect.calcArea();
        System.out.println("Rectangle's Info and Calculation");
        System.out.println("Rectangle's Length: " + rect.getLength());
        System.out.println("Rectangle's Width: " + rect.getWidth());
        System.out.println("Total Area: " + rect.getResult());

        rect.calcPerimeter();
        System.out.println("Total Perimeter: " + rect.getResult());
    }
}
