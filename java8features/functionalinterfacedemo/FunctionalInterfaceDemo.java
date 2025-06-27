package java8features.functionalinterfacedemo;

public class FunctionalInterfaceDemo {

    // A functional interface is an interface that contains only one abstract
    // method.
    @FunctionalInterface
    public interface Operation {
        int operation(int a, int b);
    }

    public static void FunctionalInterfacelamdaexpDemo() {
        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        System.out.println("Addition: " + addition.operation(10, 5));
        System.out.println("Subtraction: " + subtraction.operation(10, 5));
        System.out.println("Multiplication: " + multiplication.operation(10, 5));
        System.out.println("Division: " + division.operation(10, 5));
    }

    public static void main(String[] args) {
        System.out.println("Fnctional interface with Lambda Expression Demo");
        FunctionalInterfacelamdaexpDemo();
    }

}
