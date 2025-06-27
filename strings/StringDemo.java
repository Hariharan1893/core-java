package strings;

public class StringDemo {
    public static void main(String[] args) {

        // String creation (literal vs new)
        String str1 = "Hari";
        String str2 = "Hari";
        String str3 = new String("Hari");

        System.out.println("str1 == str2: " + (str1 == str2)); // true - from pool
        System.out.println("str1 == str3: " + (str1 == str3)); // false - new object

        // Immutability
        String greeting = "Hello";
        greeting = greeting.concat(" Java");
        System.out.println("After concat (immutable): " + greeting); // Still "Hello"

        // String methods
        String name = "  Hariharan Ramesh  ";
        System.out.println("Length: " + name.length());
        System.out.println("Trimmed: " + name.trim());
        System.out.println("Length after Trimmed: " + name.trim().length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Substring: " + name.substring(2, 6));
        System.out.println("Char at 4: " + name.charAt(4));
        System.out.println("Index of 'P': " + name.indexOf('R'));
        System.out.println("Replace: " + name.replace("Hari", "Ram"));

        // equals vs ==
        String a = "Java";
        String b = new String("Java");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a.equals(b): " + a.equals(b)); // true

        // Split and Loop
        String csv = "apple,banana,grapes";
        String[] fruits = csv.split(",");
        System.out.print("Fruits: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Performance: Avoid concat in loop
        String badConcat = "";
        for (int i = 0; i < 3; i++) {
            badConcat += i; // Avoid this in real-world
        }
        System.out.println("Bad Concat: " + badConcat);

        // Use StringBuilder instead
        StringBuilder goodConcat = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            goodConcat.append(i);
        }
        System.out.println("Good Concat: " + goodConcat.toString());
    }
}
