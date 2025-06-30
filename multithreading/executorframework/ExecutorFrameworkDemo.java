package multithreading.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorFrameworkDemo {

    public static void main(String[] args) throws Exception {

        System.out.println("========== 1. ExecutorService & ThreadPool ==========");

        // ExecutorService is the main interface for managing a thread pool
        ExecutorService fixedPool = Executors.newFixedThreadPool(2); // Thread pool with 2 threads

        // Runnable task (does not return result)
        Runnable runnableTask = () -> System.out
                .println("Runnable Task executed by: " + Thread.currentThread().getName());

        // Submit Runnable task
        fixedPool.execute(runnableTask); // execute() doesn't return any result

        System.out.println("========== 2. Callable & Future ==========");

        // Callable task (returns a value and can throw exception)
        Callable<Integer> callableTask = () -> {
            System.out.println("Callable Task executed by: " + Thread.currentThread().getName());
            return 100;
        };

        // Submit Callable and get Future to retrieve result later
        Future<Integer> future = fixedPool.submit(callableTask);

        // Future.get() blocks until result is ready
        System.out.println("Callable returned result: " + future.get());

        System.out.println("========== 3. FutureTask (both Runnable & Future) ==========");

        // FutureTask is a concrete implementation of Runnable + Future
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            return "FutureTask Result from: " + Thread.currentThread().getName();
        });

        // Can be executed by ExecutorService or Thread
        fixedPool.execute(futureTask);

        // Retrieve result
        System.out.println(futureTask.get());

        System.out.println("========== 4. ScheduledExecutorService ==========");

        // ScheduledExecutorService schedules tasks with delay or fixed rate
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Run task after 2 seconds delay
        Runnable delayedTask = () -> System.out
                .println("Scheduled Task (delayed) executed at: " + System.currentTimeMillis());
        scheduler.schedule(delayedTask, 2, TimeUnit.SECONDS);

        // Run task repeatedly every 3 seconds (after initial 1 second delay)
        Runnable repeatingTask = () -> System.out.println("Scheduled Task (fixed rate): " + System.currentTimeMillis());
        scheduler.scheduleAtFixedRate(repeatingTask, 1, 3, TimeUnit.SECONDS);

        // Let it run for a while to observe output
        Thread.sleep(10000);

        // Shutdown executors
        scheduler.shutdown();
        fixedPool.shutdown();
    }
}
