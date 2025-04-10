package encapsulation;

// car showroom
// understanding class and objects 

public class Encap1 {
    // defigning class with attributes
        private String brand;
        private String color;
        private double price;
    
        // setter methods 
        public void setInfo(String brand, String color, double price) {
            this.brand = brand;
            this.color = color;
            this.price = price;
        }
    
        public double ifDisc() {
            // creates another method for the discount
            if (price >= 1000) {
               return price - (price * 0.20); // applies the discount 
            } else {
                return price; // no discount 
            }
        }
    
        // getter methods 
        public String getBrand() {
            return brand;
        }
    
        public String getColor() {
            return color;
        }
    
        public double getPrice() {
            return price;
        }
        
    
        public static void main(String[] args) {
            
            // creates the an object for the pracset1
            Encap1 car1 = new Encap1();
            Encap1 car2 = new Encap1();
    
            // calls the public method on the object
            car1.setInfo("Toyota", "White", 1500); 
            car2.setInfo("Nissan", "Black", 2500);
    
            // prints the results 
            System.out.println("Brand: " + car1.getBrand());
            System.out.println("Color: " + car1.getColor());
            System.out.println("Price: " + car1.getPrice());
            System.out.println("Final Price: " + car1.ifDisc());
    
            // new line
            System.out.println("");
    
            System.out.println("Brand: " + car2.getBrand());
            System.out.println("Color: " + car2.getColor());
            System.out.println("Price: " + car2.getPrice());
            System.out.println("Final Price: " + car2.ifDisc());
        }
    }
