package multithreading.semaphore;

import java.util.concurrent.Semaphore;

class ParkingLot {

    // A Semaphore is a concurrency tool used to limit the number of threads
    // accessing a resource simultaneously.

    // Create a Semaphore with 2 permits (slots)
    private final Semaphore semaphore = new Semaphore(2);

    public void parkCar(String carName) {
        try {
            System.out.println(carName + " is trying to enter the parking lot...");

            // Acquire a permit (enter parking)
            semaphore.acquire();

            System.out.println(carName + " has entered the parking lot.");
            Thread.sleep(3000); // Simulate parking time

            System.out.println(carName + " is leaving the parking lot.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Always release the permit (exit parking)
            semaphore.release();
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        // Create multiple threads (cars)
        for (int i = 1; i <= 5; i++) {
            String carName = "Car-" + i;
            new Thread(() -> lot.parkCar(carName)).start();
        }

    }
}
