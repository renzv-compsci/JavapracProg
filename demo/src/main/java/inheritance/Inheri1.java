package inheritance;

// School management System (Basic Inheritance)
// Concepts Practiced: Base class, subclass, method overriding

class Person {
    String name;
    int age;
    String address;

    public Person (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Student extends Person {
    String studentId;
    int gradeLevel;

    public Student (String name, int age, String address, String studentId, int gradeLevel){
        super(name, age, address);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
    } 

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

class Teacher extends Person {
    String employeeId;
    String subject;

    public Teacher (String name, int age, String address, String employeeId, String subject){
        super(name, age, address);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    @Override 
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Specialized Subject: " + subject);
    }
}

public class Inheri1 {
    public static void main(String[] args) {
        
        Teacher teacher = new Teacher("Jerik", 25, "Manila City", "2020-100245", "Java-OOP");
        Student student = new Student("Renz", 19, "Quezon City", "2024-1000234", 3);

        System.out.println("Student Info");
        student.displayInfo();

        System.out.println("\nTeacher Info");
        teacher.displayInfo();
    }
}


