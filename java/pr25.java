// Write a java program which implements the final class and final method
// Final class
/*  Final Class:A final class is a class that cannot be subclassed or extended.
    Final Method:A final method is a method that cannot be overridden by subclasses.
*/
final class Car {
    // Final method
    public final void startEngine() {
        System.out.println("The car's engine is starting...");
    }

    // Non-final method
    public void stopEngine() {
        System.out.println("The car's engine is stopping...");
    }
}

// This will cause an error because Car is a final class
// class SportsCar extends Car { } 

public class pr25 {
    public static void main(String[] args) {
        // Creating an object of final class Car
        Car myCar = new Car();

        // Calling final method
        myCar.startEngine(); // Output: The car's engine is starting...

        // Calling non-final method
        myCar.stopEngine(); // Output: The car's engine is stopping...
    }
}
