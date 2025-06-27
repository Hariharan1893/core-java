package java8features.optionalclassdemo;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        // Case 1: Value is present (non-null)
        Optional<String> optionalName = Optional.of("Hari");

        // isPresent(): Checks if value exists
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        }

        // ifPresent(): Executes lambda if value exists
        optionalName.ifPresent(name -> System.out.println("Hello, " + name));

        // orElse(): Returns value if present, else returns default
        String finalName = optionalName.orElse("Default Name");
        System.out.println("Name using orElse: " + finalName);

        // orElseGet(): Returns value if present, else calls supplier to compute one
        String nameFromOrElseGet = optionalName.orElseGet(() -> "Generated Name");
        System.out.println("Name using orElseGet: " + nameFromOrElseGet);

        // orElseThrow(): Returns value if present, else throws exception
        String nameFromOrElseThrow = optionalName.orElseThrow(() -> new RuntimeException("Name not found"));
        System.out.println("Name using orElseThrow: " + nameFromOrElseThrow);

        System.out.println("\n---- Null Case ----");

        // Case 2: Value is absent (null)
        Optional<String> emptyOptional = Optional.ofNullable(null);

        // isPresent(): false
        System.out.println("Is present? " + emptyOptional.isPresent()); // false

        // ifPresent(): nothing gets printed
        emptyOptional.ifPresent(name -> System.out.println("You won't see this"));

        // orElse(): returns default
        System.out.println("orElse result: " + emptyOptional.orElse("No Name"));

        // orElseGet(): returns generated value
        System.out.println("orElseGet result: " + emptyOptional.orElseGet(() -> "Fallback Name"));

        // orElseThrow(): throws exception if value absent
        try {
            String result = emptyOptional.orElseThrow(() -> new IllegalArgumentException("No value present!"));
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Caught exception from orElseThrow: " + e.getMessage());
        }

        // map(): skipped because value is absent
        Optional<String> resultMap = emptyOptional.map(val -> val.toUpperCase());
        System.out.println("Result of map on empty optional: " + resultMap);
    }
}
