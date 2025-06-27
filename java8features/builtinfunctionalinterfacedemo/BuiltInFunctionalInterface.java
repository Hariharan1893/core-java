package java8features.builtinfunctionalinterfacedemo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterface {

    public static void PredicateDemo() {
        // Predicate is a functional interface that takes an argument and returns a
        // boolean value.
        // It is often used for filtering collections.

        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println("Is 4 even? " + isEven.test(4)); // true
        System.out.println("Is 5 even? " + isEven.test(5)); // false

    }

    public static void FunctionDemo() {
        // Function is a functional interface that takes an argument and returns a
        // value.

        Function<Integer, Integer> square = sq -> sq * sq;

        System.out.println(square.apply(4));
        System.out.println(square.apply(5));
    }

    public static void ConsumerDemo() {
        Consumer<String> printer = msg -> System.out.println("Hello " + msg);

        printer.accept("Hari");
    }

    public static void SupplierDemo() {
        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());
    }

    public static void main(String[] args) {

        System.out.println("Built-in Functional Interface Demo");
        System.out.println("=====================================");

        System.out.println("Predicate Demo");
        PredicateDemo();

        System.out.println("Function Demo");
        FunctionDemo();

        System.out.println("Consumer Demo");
        ConsumerDemo();

        System.out.println("Supplier Demo");
        SupplierDemo();

    }

}
