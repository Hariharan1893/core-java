package multithreading.threadlifecycle;

class LifecycleThread extends Thread {

    @Override
    public void run() {
        System.out.println(getName() + " → State in run(): " + getState());

        try {
            System.out.println(getName() + " is going to sleep...");
            Thread.sleep(1000); // Thread goes to TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(getName() + " has finished execution.");
    }
}

public class ThreadLifecycleDemo {
    public static void main(String[] args) {

        LifecycleThread thread = new LifecycleThread();
        thread.setName("MyLifecycleThread");

        // State: NEW (thread is created but not started)
        System.out.println("State after creation: " + thread.getState());

        thread.start();

        // Small pause to ensure thread has started
        try {
            Thread.sleep(100); // Main thread sleeps briefly
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // State: RUNNABLE (or possibly TIMED_WAITING if it's sleeping)
        System.out.println("State while running: " + thread.getState());

        // Wait for the thread to finish execution
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // State: TERMINATED (after run() completes)
        System.out.println("State after completion: " + thread.getState());
    }
}
