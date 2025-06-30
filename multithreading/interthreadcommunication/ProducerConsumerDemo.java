package multithreading.interthreadcommunication;

// shared resource for producer and consumer
class SharedBuffer {

    // shared data
    private int data;
    // buffer status
    private boolean isEmpty = true;

    // Producer puts data in buffer

    public synchronized void produce(int value) {
        // producer checks the buffer status before produce
        while (!isEmpty) {
            try {
                System.out.println("Producer is waiting until the buffer is empty....");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        // if buffer is empty
        data = value;
        System.out.println("Producer Produced: " + value);
        isEmpty = false;
        // after produced the consumer gets notified
        notify();
    }

    // Consumer takes the data from the buffer
    public synchronized int consume() {
        // checking the buffer status
        while (isEmpty) {
            try {
                System.out.println("Consumer is waiting until the producer produces....");
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

        System.out.println("Consumer consumed: " + data);
        isEmpty = true;
        // after consumed it will notify the producer wait() to produce again
        notify();

        return data;
    }

}

class Producer extends Thread {
    private SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // produce 5 times
            buffer.produce(i);

            try {
                // production delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}

class Consumer extends Thread {

    private SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // consumes 5 times
            buffer.consume();
            try {
                // consumption delay
                Thread.sleep(800);
            } catch (InterruptedException e) {
                System.out.println("Exception: " + e.getLocalizedMessage());
            }
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) throws InterruptedException {

        SharedBuffer buffer = new SharedBuffer();

        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println("==== All the produced data from the buffer is consumed===");
    }
}
