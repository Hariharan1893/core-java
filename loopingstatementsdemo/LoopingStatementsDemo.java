package loopingstatementsdemo;

public class LoopingStatementsDemo {

    public static void main(String[] args) {

        // 1. For Loop: Executes a block a fixed number of times
        System.out.println("For Loop Example:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // 2. While Loop: Runs while the condition is true
        System.out.println("\nWhile Loop Example:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // 3. Do-While Loop: Executes at least once even if condition is false
        System.out.println("\nDo-While Loop Example:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);

        // 4. Enhanced For Loop (for-each): Used for arrays or collections
        System.out.println("\nEnhanced For Loop (For-Each) Example:");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // 5. Breaking a loop using break statement
        System.out.println("\nBreak Statement Example:");
        for (int x = 1; x <= 10; x++) {
            if (x == 6) {
                System.out.println("Breaking loop at x = " + x);
                break; // exits the loop when x is 6
            }
            System.out.println("x = " + x);
        }

        // 6. Skipping an iteration using continue statement
        System.out.println("\nContinue Statement Example:");
        for (int y = 1; y <= 5; y++) {
            if (y == 3) {
                continue; // skips the rest of the loop when y is 3
            }
            System.out.println("y = " + y);
        }
    }
}
