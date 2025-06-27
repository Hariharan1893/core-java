package stringbufferdemo;

public class StringBufferDemo {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();

        // Append text to the end
        sb.append(" Java"); // "Hari Java"
        System.out.println("After append: " + sb);

        // Insert text at a specific position (index 5)
        sb.insert(5, "Loves "); // "Hari Loves Java"
        System.out.println("After insert: " + sb);

        // Replace characters from index 0 to 4 with "User"
        sb.replace(0, 4, "User"); // "User Loves Java"
        System.out.println("After replace: " + sb);

        // Delete characters from index 5 to 11
        sb.delete(5, 11); // Removes "Loves ", result: "User Java"
        System.out.println("After delete: " + sb);

        // Reverse the characters
        sb.reverse(); // "avaJ resU"
        System.out.println("After reverse: " + sb);

        // Get current capacity (total internal buffer size)
        System.out.println("Capacity: " + sb.capacity());

        // Get the number of characters currently stored
        System.out.println("Length: " + sb.length());

        // Get a character at a specific index (e.g. index 2)
        System.out.println("Character at index 2: " + sb.charAt(2));

        // Change a character at a given index
        sb.setCharAt(0, 'X'); // Replaces first character with 'X'
        System.out.println("After setCharAt: " + sb);
    }
}
