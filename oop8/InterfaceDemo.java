package oop8;

// Interface definitions
interface Engine {
    void start();

    void stop();
}

interface Vehicle {
    void drive();

    void park();
}

interface Accelerate {
    void accelerate();
}

// Car class implements all interfaces
class Car implements Engine, Vehicle, Accelerate {
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving");
    }

    @Override
    public void park() {
        System.out.println("Car is parking");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }
}

// Bike class implements all interfaces
class Bike implements Engine, Vehicle, Accelerate {
    @Override
    public void start() {
        System.out.println("Bike is starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping");
    }

    @Override
    public void drive() {
        System.out.println("Bike is driving");
    }

    @Override
    public void park() {
        System.out.println("Bike is parking");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is accelerating");
    }
}

// Driver class
public class InterfaceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        System.out.println("=== Car Operations ===");
        car.start();
        car.accelerate();
        car.drive();
        car.park();
        car.stop();

        System.out.println("\n=== Bike Operations ===");
        bike.start();
        bike.accelerate();
        bike.drive();
        bike.park();
        bike.stop();
    }
}
