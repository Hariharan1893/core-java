package java8features.streamsapidemo.streamcreationdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    public static void main(String[] args) {

        // 1. create a stream from a collection
        // using collection.stream() method
        System.out.println("1. create a stream from a collection");
        List<String> names = Arrays.asList("Hari", "Aadhi", "Ahana");

        names.stream().forEach(System.out::println);

        System.out.println();

        // 2. create a stream from an array

        System.out.println("2. create a stream from an array");

        String[] nameArray = { "Hari", "Aadhi", "Ahana" };

        Arrays.stream(nameArray).forEach(System.out::println);

        int[] intArray = { 1, 2, 3, 4, 5 };

        System.out.println();

        // create a stream from an array of primitive types

        System.out.println("create a stream from an array of primitive types");

        Arrays.stream(intArray).forEach(System.out::println);

        // using IntStream.of() method

        IntStream.of(intArray).forEach(System.out::println);

        System.out.println();

        // 3. create a stream using Stream.of() method

        // create a stream from a variable number of arguments

        System.out.println("3. create a stream using Stream.of() method");

        Stream<String> nameStream = Stream.of("Hari", "Aadhi", "Ahana");

        nameStream.forEach(System.out::println);

        System.out.println();

        // 4. create using Stream.generate() method

        // create an infinite stream using Stream.generate() use limit() to limit the
        // number of elements

        // Stream.generate() -- passess a supplier function that generates an element
        // each time it is called

        System.out.println("4. create using Stream.generate() method");

        Stream.generate(() -> "Hello").limit(3).forEach(System.out::println);

        System.out.println();

        // 5. create using Stream.iterate() method

        // create an infinite stream using Stream.iterate() use limit() to limit the

        System.out.println("5. create using Stream.iterate() method");

        Stream.iterate(2, n -> n % 2 == 0 ? n + 2 : n + 1).limit(10).forEach(System.out::println);

        System.out.println();
    }
}
