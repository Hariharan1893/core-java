package java8features.lambdademo;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {

    // Lambda expressions are a way to provide clear and concise syntax for writing
    // anonymous methods.

    public static void lambdaExpressionDemo() {

        List<String> names = Arrays.asList("Hari", "John", "Ravi");

        names.forEach(name -> System.out.println(name));

    }

    public static void main(String[] args) {

        System.out.println("Lambda Expression Demo");
        lambdaExpressionDemo();

    }

}
