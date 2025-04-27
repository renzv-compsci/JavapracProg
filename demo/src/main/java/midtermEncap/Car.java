package midtermEncap;

/*Create a class called Car wit the following private fields:
 * make (String)
 * model (String)
 * year (int)
 * speed (int)
 * 
 * This class should include:
 * A getter for each field (make, model, year, speed)
 * A setter to update the car's speed (but limit it to a maximum value)
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    // setter for car infos
    public void carInfo(String make, String model, int year, int speed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    // setter with logic 
    public void setSpeedMax() {
        if (speed == 300) {
            System.out.println("This is the maximum speed of the car.");
        } else if (speed <= 150) {
            System.out.println("This is the minimum speed of the car.");
        } else {
            System.out.println("The car cannot go beyond 300 kmph");
        }
    }

    // getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        
        Car info = new Car();

        info.carInfo("Toyota", "Corolla", 2020, 300);

        System.out.println("Car Info");
        System.out.println("Car Make: " + info.getMake());
        System.out.println("Car Model: " + info.getModel());
        System.out.println("Car Speed: " + info.getSpeed());

        info.setSpeedMax();

    }
}
