package java8features.streamsapidemo.streamoperationdemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperation {

    public static void filterDemo() {
        // filter() is an intermediate operation that returns a stream consisting of the
        // elements based on the given condition.
        // it does not modify the original stream

        System.out.println("Filter() Demo: ");

        List<String> names = Arrays.asList("Hariharan", "Rafel", "Saran", "Ashoke", "Sakthi");

        List<String> nameStream = names.stream()
                .filter(name -> name.length() > 5)
                .collect(Collectors.toList());

        System.out.println("Names with length greater than 5: " + nameStream);
    }

    public static void mapDemo() {
        // map() is an intermediate operation that returns a stream consisting of the
        // results of applying the given function to the elements of the stream.

        // it does not modify the original stream

        // Example: convert all the names to uppercase

        List<String> names = Arrays.asList("Hariharan", "Rafel", "Saran", "Ashoke", "Sakthi");

        List<String> nameStream = names.stream()
                .filter(name -> name.length() > 5)
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Map() Demo: ");
        System.out.println("Names with length greater than 5 in uppercase: " + nameStream);

    }

    public static void flatMapDemo() {
        // flatMap() is an intermediate operations that returns a stream consisting of
        // the
        // results of replacing each elements of this stream with the contents of a
        // mapped stream produced by applying the
        // given function to each element.

        // Example: flattening a list of Lists into a single list

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B", "C"),
                Arrays.asList("D", "E"),
                Arrays.asList("F", "G", "H"));

        List<String> flattenedList = listOfLists.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("FlatMap() Demo: ");
        System.out.println("Flattened List: " + flattenedList);
    }

    public static void sortedDemo() {
        // sorted() is an intermediate operation that returns a stream consisting of the
        // elements of the stream, sorted in natural order or by a provided comparator.

        List<Integer> number = Arrays.asList(5, 3, 8, 1, 2);

        List<Integer> sortedAsc = number.stream()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> sortedDesc = number.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Sorted() Demo: ");

        System.out.println("Sorted in Ascending Order: " + sortedAsc);

        System.out.println("Sorted in Descending Order: " + sortedDesc);

    }

    public static void distinctDemo() {

        // distinct() – Remove duplicates

        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 1, 4);
        List<Integer> unique = nums.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("distinct() result: " + unique);
    }

    public static void skipExample() {
        // skip(n) – Skip first n elements

        List<String> items = Arrays.asList("A", "B", "C", "D", "E");
        List<String> skipped = items.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("skip() result: " + skipped); // [C, D, E]
    }

    public static void peekExample() {

        // peek() – Debug each element in stream
        List<String> names = Arrays.asList("Hari", "Ravi", "John");

        List<String> result = names.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("peek() result: " + result); // [HARI, RAVI, JOHN]
    }

    public static void main(String[] args) {

        // Demonstrating intermediate operations in Java Streams API

        filterDemo();

        mapDemo();

        flatMapDemo();

        sortedDemo();

        distinctDemo();

        skipExample();

        peekExample();

    }
}
