package multithreading.atomicvariable;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    // Shared atomic variable
    private AtomicInteger count = new AtomicInteger(0);

    // Increment method
    public void increment() {
        count.incrementAndGet(); // atomic: same as ++count
    }

    public int getCount() {
        return count.get();
    }
}

public class AtomicVariableDemo {

    // Atomic variable provides lock-free and thread-free operations on a single
    // variables like int, long, boolen, references.

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();

        // Task to increment the counter 1000 times
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        };

        // Creating multiple threads
        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all to finish
        t1.join();
        t2.join();
        t3.join();

        // Final result
        System.out.println("Final atomic counter value: " + counter.getCount());
    }

}
