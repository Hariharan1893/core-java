package java8features.streamsapidemo.streamterminaldemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalOperations {

    // 1. collect() – Collect to list
    public static void collectExample() {
        List<String> names = Arrays.asList("Hari", "Ravi", "Arun");
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("collect(): " + filtered); // [Arun]
    }

    // 2. forEach() – Perform action on each
    public static void forEachExample() {
        System.out.print("forEach(): ");
        Stream.of(1, 2, 3).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }

    // 3. count() – Count the number of elements
    public static void countExample() {
        long count = Stream.of("A", "B", "C", "A").filter(s -> s.equals("A")).count();
        System.out.println("count(): " + count); // 2
    }

    // 4. min() – Find min element
    public static void minExample() {
        Optional<Integer> min = Stream.of(5, 3, 9, 1).min(Integer::compareTo);
        min.ifPresent(m -> System.out.println("min(): " + m)); // 1
    }

    // 5. max() – Find max element
    public static void maxExample() {
        Optional<Integer> max = Stream.of(5, 3, 9, 1).max(Integer::compareTo);
        max.ifPresent(m -> System.out.println("max(): " + m)); // 9
    }

    // 6. anyMatch() – Check if any element matches
    public static void anyMatchExample() {
        boolean result = Stream.of("Java", "Python", "C++").anyMatch(lang -> lang.equals("Python"));
        System.out.println("anyMatch(): " + result); // true
    }

    // 7. allMatch() – Check if all elements match
    public static void allMatchExample() {
        boolean result = Stream.of(2, 4, 6).allMatch(n -> n % 2 == 0);
        System.out.println("allMatch(): " + result); // true
    }

    // 8. noneMatch() – Check if none match
    public static void noneMatchExample() {
        boolean result = Stream.of(1, 3, 5).noneMatch(n -> n % 2 == 0);
        System.out.println("noneMatch(): " + result); // true
    }

    // 9. findFirst() – Get first element (Optional)
    public static void findFirstExample() {
        Optional<String> first = Stream.of("a", "b", "c").findFirst();
        first.ifPresent(val -> System.out.println("findFirst(): " + val)); // a
    }

    // 10. findAny() – Get any element (useful in parallel)
    public static void findAnyExample() {
        Optional<String> any = Stream.of("x", "y", "z").findAny();
        any.ifPresent(val -> System.out.println("findAny(): " + val)); // x (or any)
    }

    // 11. reduce() – Combine elements to single result
    public static void reduceExample() {
        int sum = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        System.out.println("reduce(): " + sum); // 10
    }

    public static void main(String[] args) {
        collectExample();
        forEachExample();
        countExample();
        minExample();
        maxExample();
        anyMatchExample();
        allMatchExample();
        noneMatchExample();
        findFirstExample();
        findAnyExample();
        reduceExample();
    }

}
