package exceptionhandlingdemo;

import java.util.Scanner;

// Custom checked exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method to divide two numbers
    public static int divide(int a, int b) {
        return a / b; // may throw ArithmeticException
    }

    // Method to demonstrate array access
    public static void accessArrayElement(int[] arr, int index) {
        System.out.println("Array Element at index " + index + ": " + arr[index]); // may throw
                                                                                   // ArrayIndexOutOfBoundsException
    }

    // Method to validate age using custom exception
    public static void validateAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or older.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {

            // // Input for division
            // System.out.println("Enter two integers to divide:");
            // int num1 = s.nextInt();
            // int num2 = s.nextInt();

            // System.out.println("\nCompile Time Exception: ArithmeticException");
            // System.out.println("--------------------------------------------------");
            // int result = divide(num1, num2);
            // System.out.println("Result: " + result);

            // // Array access
            // int[] arr = { 1, 2, 3, 4, 5 };
            // System.out.println("\nRun Time Exception: ArrayIndexOutOfBoundsException");
            // System.out.println("--------------------------------------------------");
            // accessArrayElement(arr, 5); // accessing invalid index

            // Age input
            System.out.println("\nCustom Exception: AgeException");
            System.out.println("--------------------------------------------------");
            System.out.println("Enter your age:");
            int age = s.nextInt();
            validateAge(age);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an invalid array index.");
        } catch (AgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            s.close();
            System.out.println("\nScanner closed.");
        }
    }
}
