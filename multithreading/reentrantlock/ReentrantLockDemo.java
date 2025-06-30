package multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

// Shared resource class
class Counter {
    private int count = 0;

    // ReentrantLock instance
    private final ReentrantLock lock = new ReentrantLock();

    /**
     * This method increments the counter in a thread-safe manner
     * using ReentrantLock to prevent race conditions.
     */
    public void increment() {
        lock.lock(); // Step 1: acquire the lock

        try {
            count++; // Step 2: critical section
        } finally {

            lock.unlock(); // Step 3: release the lock
        }
    }

    /**
     * Demonstrates the "reentrant" behavior of ReentrantLock.
     * The same thread can acquire the lock multiple times.
     * Each call to lock() must be matched with a corresponding unlock().
     */
    public void doSomething() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " locked first time");

            lock.lock(); // reentrant lock: allowed for the same thread
            try {
                System.out.println(Thread.currentThread().getName() + " locked second time");
            } finally {

                lock.unlock(); // inner unlock
            }

        } finally {

            lock.unlock(); // outer unlock
        }
    }

    public int getCount() {
        return count;
    }
}

// Main class to test ReentrantLock
public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Runnable task to increment the counter 1000 times
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++)
                counter.increment();

        };

        // Runnable task to demonstrate reentrant locking
        Runnable reentrantTask = () -> counter.doSomething();

        // Threads to increment counter
        Thread t1 = new Thread(incrementTask, "Incrementer-1");
        Thread t2 = new Thread(incrementTask, "Incrementer-2");

        // Thread to demonstrate reentrancy
        Thread t3 = new Thread(reentrantTask, "ReentrantThread");

        // Start incrementer threads
        t1.start();
        t2.start();

        // Wait for them to complete
        t1.join();
        t2.join();

        // Print final counter value
        System.out.println("Final count: " + counter.getCount());

        // Start the reentrant lock demo thread
        t3.start();
        t3.join();

    }
}
