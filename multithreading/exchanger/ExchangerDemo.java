package multithreading.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {

    public static void main(String[] args) {

        // Exchanger<T> is a synchronization point where two threads can exchange data.

        // Create an Exchanger for exchanging String data
        Exchanger<String> exchanger = new Exchanger<>();

        // Thread 1: sending data A and waiting to receive from Thread 2
        Thread threadA = new Thread(() -> {
            String dataA = "Data from Thread A";

            try {
                System.out.println("Thread A is ready to exchange: " + dataA);

                // Will block until another thread also calls exchange()
                String received = exchanger.exchange(dataA);

                System.out.println("Thread A received: " + received);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Thread 2: sending data B and waiting to receive from Thread 1
        Thread threadB = new Thread(() -> {
            String dataB = "Data from Thread B";

            try {
                System.out.println("Thread B is ready to exchange: " + dataB);

                String received = exchanger.exchange(dataB);

                System.out.println("Thread B received: " + received);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        threadA.start();
        threadB.start();
    }
}
