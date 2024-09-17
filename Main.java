// Base class Vehicle
class Vehicle {
    // Attributes of the Vehicle class
    String make;
    String model;
    int year;

    // Constructor for the Vehicle class
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

// Derived class Car that extends Vehicle
class Car extends Vehicle {
    // Additional attribute for the Car class
    int numberOfDoors;

    // Constructor for the Car class, which includes Vehicle's attributes
    public Car(String make, String model, int year, int numberOfDoors) {
        // Call the constructor of the base class (Vehicle)
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display the car's details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Main class to create an instance of Car and display its details
public class Main {
    public static void main(String[] args) {
        // Create an instance of Car and set values for its attributes
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Call the displayDetails method to print the car details
        myCar.displayDetails();
    }
}
