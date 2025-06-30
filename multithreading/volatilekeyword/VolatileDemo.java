package multithreading.volatilekeyword;

class VolatileFlagExample {

    // Ensures visibility of changes to variables across threads. Prevents threads
    // from caching variables locally — they always read from main memory. Does not
    // ensure atomicity — only visibility.

    // Without 'volatile', the running thread might never see the change to this
    // flag
    private volatile boolean running = true;

    // Thread that runs until the flag becomes false
    public void startTask() {
        System.out.println("Task started...");
        while (running) {
            // Simulating some work
        }
        System.out.println("Task stopped.");
    }

    // Method to stop the running thread
    public void stopTask() {
        running = false;
    }
}

public class VolatileDemo {
    public static void main(String[] args) throws InterruptedException {
        VolatileFlagExample task = new VolatileFlagExample();

        // Thread to run the task
        Thread worker = new Thread(task::startTask);
        worker.start();

        // Sleep main thread for 2 seconds
        Thread.sleep(2000);

        // Now stop the task by setting running = false
        task.stopTask();

        System.out.println("Requested to stop task.");
    }
}
