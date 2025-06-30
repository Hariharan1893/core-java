package multithreading.synchronizationdemo;

class Counter {

    int count = 0;

    // Static counter for static synchronization demonstration
    static int staticCount = 0;

    public void resetCounter() {
        count = 0;
    }

    public static void resetStaticCounter() {
        staticCount = 0;
    }

    // Method without synchronization — not thread-safe
    public void incrementWithoutSync() {
        count++;
    }

    // Method-Level Synchronization — thread-safe
    public synchronized void incrementWithSyncMethod() {
        count++;
    }

    // Block-Level Synchronization — thread-safe (more control)
    public void incrementWithSyncBlock() {
        synchronized (this) {
            count++;
        }
    }

    // Static Synchronization — class-level lock (shared across all instances)
    public static synchronized void staticIncrementSync() {
        staticCount++;
    }
}

public class SyncDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        // 🔹 Threads without synchronization
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.incrementWithoutSync();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.incrementWithoutSync();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Without Synchronization (Expected: 2000): " + c.count);

        // 🔹 Method-level synchronization
        c.resetCounter(); // Reset to 0

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.incrementWithSyncMethod();
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.incrementWithSyncMethod();
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println("Method-Level Synchronization (Expected: 2000): " + c.count);

        // 🔹 Block-level synchronization
        c.resetCounter(); // Reset to 0 again

        Thread t5 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.incrementWithSyncBlock();
        });

        Thread t6 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.incrementWithSyncBlock();
        });

        t5.start();
        t6.start();

        t5.join();
        t6.join();

        System.out.println("Block-Level Synchronization (Expected: 2000): " + c.count);

        // 🔹 Static Synchronization
        Counter.resetStaticCounter(); // Static count reset

        Thread t7 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                Counter.staticIncrementSync();
        });

        Thread t8 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                Counter.staticIncrementSync();
        });

        t7.start();
        t8.start();

        t7.join();
        t8.join();

        System.out.println("Static Synchronization (Expected: 2000): " + Counter.staticCount);
    }
}
