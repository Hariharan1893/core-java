package multithreading.threadandrunnable;

// Implements Runnable
class MyRunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Runnable thread is running.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(500); // Simulate some delay
            } catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted");
            }
        }
    }
}

// Extends Thread
class MyThreadTask extends Thread {
    public MyThreadTask(String name) {
        this.setName(name); // Set thread name
    }

    @Override
    public void run() {
        System.out.println(this.getName() + ": Thread (extends Thread) is running.");
        for (int i = 1; i <= 3; i++) {
            System.out.println(this.getName() + ": " + i);
            try {
                Thread.sleep(300); // Sleep for 300 ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Class containing all thread method demonstrations
class ThreadMethodsDemo extends Thread {
    public ThreadMethodsDemo(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + ": is alive? " + isAlive());
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + ": " + i);

            // Suggest CPU to switch (may or may not happen)
            Thread.yield();

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
        System.out.println(getName() + ": finished.");
    }
}

// Main class to execute everything
public class ThreadDemoMain {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("== Creating thread using Runnable ==");
        Thread t1 = new Thread(new MyRunnableTask(), "RunnableThread");
        t1.setPriority(Thread.NORM_PRIORITY);
        t1.start();

        System.out.println("== Creating thread using Thread class ==");
        MyThreadTask t2 = new MyThreadTask("ExtendedThread");
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();

        System.out.println("== Creating thread to demonstrate thread methods ==");
        ThreadMethodsDemo t3 = new ThreadMethodsDemo("MethodThread");
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();

        // Demonstrating join
        t1.join(); // Wait for t1 to complete
        t2.join(); // Wait for t2 to complete
        t3.join(); // Wait for t3 to complete

        System.out.println("== All threads finished ==");
    }
}
