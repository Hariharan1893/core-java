package multithreading.conditioninterface;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedBuffer {
    private int item;
    private boolean hasValue = false;

    // ReentrantLock and Condition
    private final Lock lock = new ReentrantLock();

    private final Condition notEmpty = lock.newCondition(); // for consumer
    private final Condition notFull = lock.newCondition();  // for producer

    // Producer method
    public void produce(int value) throws InterruptedException {
        lock.lock();
        try {
            // Wait if buffer already has a value
            while (hasValue) {
                notFull.await(); // Wait until the buffer is empty
            }

            // Produce item
            item = value;
            hasValue = true;
            System.out.println("Produced: " + item);

            // Signal consumer that item is available
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    // Consumer method
    public int consume() throws InterruptedException {
        lock.lock();
        try {
            // Wait if buffer is empty
            while (!hasValue) {
                notEmpty.await(); // Wait until there's something to consume
            }

            // Consume item
            int consumed = item;
            hasValue = false;
            System.out.println("Consumed: " + consumed);

            // Signal producer that buffer is now empty
            notFull.signal();

            return consumed;
        } finally {
            lock.unlock();
        }
    }
}

public class ConditionDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.produce(i);
                    Thread.sleep(1000); // simulate production time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    buffer.consume();
                    Thread.sleep(1500); // simulate consumption time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
