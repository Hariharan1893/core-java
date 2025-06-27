package genirics;

// Custom implementation of an ArrayList for integers
class CustomArrayList {

    // Internal array to store elements
    private int[] data;

    // Tracks the number of elements in the list
    private int size = 0;

    // Default initial capacity of the list
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor initializes the array with default capacity
    CustomArrayList() {
        this.data = new int[DEFAULT_CAPACITY];
    }

    // Adds an element to the end of the list
    public void add(int value) {
        if (isFull()) {
            resize(); // Double the capacity if full
        }
        this.data[size++] = value;
    }

    // Checks if the array is full
    private boolean isFull() {
        return this.size == data.length;
    }

    // Doubles the capacity of the array and copies old data
    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp; // Replace old array with the new, larger one
    }

    // Returns the element at the given index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return data[index];
    }

    // Returns the current number of elements in the list
    public int size() {
        return size;
    }

    // Clears the list by resetting the array and size
    public void clear() {
        data = new int[DEFAULT_CAPACITY]; // Reset to default capacity
        size = 0;
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Removes the last element from the list
    public void remove() {
        if (isEmpty()) {
            throw new IllegalStateException("ArrayList is empty");
        }
        data[--size] = 0; // Decrease size and reset last value
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        // code to print the content with current size
        // for (int i = 0; i < size; i++) {
        // sb.append(data[i]);
        // if (i < size - 1) {
        // sb.append(", ");
        // }
        // }

        // code to print the content with full capacity
        for (int num : data) {
            sb.append(num).append(", ");
        }

        // Remove the last comma and space if the list is not empty
        if (size > 0) {
            sb.setLength(sb.length() - 2);
        }

        sb.append("]");

        return sb.toString();
    }

    public int getCapacity() {
        return data.length;
    }
}

// CustomGenericArrayList

class CustomGenericArrayList<T> {

    // Internal array to store elements
    private Object[] data;

    // Tracks the number of elements in the list
    private int size = 0;

    // Default initial capacity of the list
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor initializes the array with default capacity
    CustomGenericArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
    }

    // Adds an element to the end of the list
    public void add(T value) {
        if (isFull()) {
            resize(); // Double the capacity if full
        }
        this.data[size++] = value;
    }

    // Checks if the array is full
    private boolean isFull() {
        return this.size == data.length;
    }

    // Doubles the capacity of the array and copies old data
    private void resize() {
        Object[] temp = new Object[data.length * 2];

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp; // Replace old array with the new, larger one
    }

    // Returns the element at the given index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) data[index];
    }

    // Returns the current number of elements in the list
    public int size() {
        return size;
    }

    // Clears the list by resetting the array and size
    public void clear() {
        data = new Object[DEFAULT_CAPACITY]; // Reset to default capacity
        size = 0;
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Removes the last element from the list
    public void remove() {
        if (isEmpty()) {
            throw new IllegalStateException("ArrayList is empty");
        }
        data[--size] = 0; // Decrease size and reset last value
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        // code to print the content with current size
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }

    public int getCapacity() {
        return data.length;
    }
}

// Main class to demonstrate the CustomArrayList functionality
public class GenericsDemo {

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("List contents: " + list.toString()); // Output: [1, 2, 3, 4]

        System.out.println("Size of list: " + list.size()); // Output: 4

        System.out.println("Element at index 2: " + list.get(2)); // Output: 3

        list.remove(); // Removes the last element (4)

        System.out.println("Size after removal: " + list.size()); // Output: 3

        System.out.println("List contents after removal: " + list.toString()); // Output: [1, 2, 3]

        list.clear(); // Clears the list

        System.out.println("Size after clearing: " + list.size()); // Output: 0

        System.out.println("Is the list empty? " + list.isEmpty()); // Output: true

        System.out.println("------------------------------------");

        for (int i = 1; i <= 15; i++) {
            list.add(i * 2);
        }

        System.out.println("List contents after adding more elements: " + list.toString() + "\n" +
                "Size of list: " + list.size() + "\n" + "Capacity of list: " + list.getCapacity());

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("String type CustomGenericArrayList");

        CustomGenericArrayList<String> list2 = new CustomGenericArrayList<>();
        list2.add("Hari");
        list2.add("Java");
        list2.add("GPT");

        System.out.println("List: " + list2); // [Hari, Java, GPT]
        System.out.println("Size: " + list2.size()); // 3
        System.out.println("Item 0: " + list2.get(0)); // Hari

        list2.remove();
        System.out.println("After remove: " + list2); // [Hari, Java]

        list2.clear();
        System.out.println("After clear: " + list2); // []
        System.out.println("Is empty? " + list2.isEmpty()); // true


        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("Integer type CustomGenericArrayList");

        CustomGenericArrayList<Integer> list3 = new CustomGenericArrayList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);

        System.out.println("List: " + list3);  // [10, 20, 30]
        System.out.println("Size: " + list3.size());  // 3
        System.out.println("Item 0: " + list3.get(0)); // 10

        list3.remove(); // Removes the last element (30)
        System.out.println("After remove: " + list3); // [10, 20]

        list3.clear();
        System.out.println("After clear: " + list3); // []
        System.out.println("Is empty? " + list3.isEmpty()); // true

    }
}
