package multithreading.readwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedResource {
    private int data = 0;

    // ReadWriteLock allows multiple readers OR one writer
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    // Read method
    public void readData(String threadName) {
        rwLock.readLock().lock(); // Acquire read lock
        try {
            System.out.println(threadName + " reading data: " + data);
            Thread.sleep(1000); // simulate read delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwLock.readLock().unlock(); // Always release lock
        }
    }

    // Write method
    public void writeData(String threadName, int value) {
        rwLock.writeLock().lock(); // Acquire write lock
        try {
            System.out.println(threadName + " writing data: " + value);
            Thread.sleep(2000); // simulate write delay
            data = value;
            System.out.println(threadName + " updated data to: " + data);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            rwLock.writeLock().unlock(); // Always release lock
        }
    }
}

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Create readers
        Runnable reader = () -> resource.readData(Thread.currentThread().getName());

        // Create writers
        Runnable writer = () -> resource.writeData(Thread.currentThread().getName(), 42);

        // Start multiple reader threads
        for (int i = 1; i <= 3; i++) {
            new Thread(reader, "Reader-" + i).start();
        }

        // Start writer thread
        new Thread(writer, "Writer-1").start();

        // More readers after writing
        for (int i = 4; i <= 6; i++) {
            new Thread(reader, "Reader-" + i).start();
        }
    }
}
