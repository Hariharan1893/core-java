package nonprimitivedatatypes;

public class NonPrimitive {
  public static void main(String[] args) {

    // string, array, wrapper classes;

    // 1. String (non-primitive)
    String message = "Hello, Jaslf324234234va!";
    String name = new String("Hari");

    System.out.println("String: " + name);
    System.out.println("String: " + message);

    // 2. Array (non-primitive)
    String[] numbers = { "Hari", "Sita", "Ram" };

    System.out.print("Array: ");
    for (String n : numbers) {
      System.out.print(n + " ");
    }
    System.out.println();

    // 3. Wrapper classes (non-primitive)
    Byte byteValue = 10;
    Short shortValue = 100;
    Integer intValue = 1000;
    Long longValue = 10000L;
    Float floatValue = 3.14f;
    Double doubleValue = 99.99;
    Character charValue = 'A';
    Boolean boolValue = true;

    System.out.println("\nWrapper Classes:");
    System.out.println("Byte: " + byteValue);
    System.out.println("Short: " + shortValue);
    System.out.println("Integer: " + intValue);
    System.out.println("Long: " + longValue);
    System.out.println("Float: " + floatValue);
    System.out.println("Double: " + doubleValue);
    System.out.println("Character: " + charValue);
    System.out.println("Boolean: " + boolValue);

    // 4. Autoboxing (primitive → wrapper)
    int num = 50;
    Integer boxed = num; // autoboxing
    System.out.println("\nAutoboxed Integer: " + boxed);

    // 5. Unboxing (wrapper → primitive)
    Integer obj = 200;
    int unboxed = obj; // unboxing
    System.out.println("Unboxed int: " + unboxed);
  }
}
