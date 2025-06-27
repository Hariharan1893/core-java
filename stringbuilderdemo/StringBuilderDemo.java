package stringbuilderdemo;

public class StringBuilderDemo {

    public static void main(String[] args) {

        // 1. Create a StringBuilder instance
        StringBuilder sb = new StringBuilder();

        // 2. Append
        sb.append(" Programming");
        System.out.println("After append: " + sb); // Java Programming

        // 3. Insert
        sb.insert(5, "is Fun ");
        System.out.println("After insert: " + sb); // Java is Fun Programming

        // 4. Delete
        sb.delete(5, 12); // removes "is Fun "
        System.out.println("After delete: " + sb); // Java Programming

        // 5. Replace
        sb.replace(5, 16, "is Awesome");
        System.out.println("After replace: " + sb); // Java is Awesome

        // 6. Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb); // emosewA si avaJ

        // 7. Convert back to string
        String result = sb.toString();
        System.out.println("As String: " + result);

        // 8. Capacity & Length
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // 9. Set character
        sb.setCharAt(0, '!');
        System.out.println("After setCharAt: " + sb);

        // 10. Ensure capacity
        sb.ensureCapacity(100);
        System.out.println("Capacity after ensure: " + sb.capacity());

        // 11. Clear the StringBuilder
        sb.setLength(0);

        System.out.println("Initial capacity: " + sb.capacity()); // 16

        System.out.println("--------------------");
        // Demonstrating capacity and resizing
        sb.append("abcdefghijklmnop"); // 16 characters
        System.out.println("After append: " + sb.capacity()); // still 16

        sb.append("q"); // triggers resizing!
        System.out.println("After resize: " + sb.capacity()); // (16*2) + 2 = 34

        System.out.println("Length: " + sb.length());

        sb.setLength(0);

        System.out.println("---------------------");

        Thread t1 = new Thread(() -> sb.append("Hello").toString());
        Thread t2 = new Thread(() -> sb.append("World").toString());

        t1.start();
        t2.start();

        System.out.println("""
                HelloWorld
                WorldHello
                HelWorldlo
                """);
    }
}
