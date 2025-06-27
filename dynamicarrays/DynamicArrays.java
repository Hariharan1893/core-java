package dynamicarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrays {

  public static void main(String[] args) {

    // Convert Array to ArrayList
    String[] arr = { "a", "b", "c" };
    ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
    System.out.println("Initial List (from Array): " + list);

    // add(element) – Add to end
    list.add("d");
    System.out.println("After add('d'): " + list);

    // add(index, element) – Insert at index
    list.add(2, "z");
    System.out.println("After add(2, 'z'): " + list);

    // get(index)
    System.out.println("Element at index 1: " + list.get(1));

    // set(index, element) – Replace at index
    list.set(0, "x");
    System.out.println("After set(0, 'x'): " + list);

    // remove(index)
    list.remove(3);
    System.out.println("After remove(3): " + list);

    // remove(object)
    list.remove("z");
    System.out.println("After remove('z'): " + list);

    // contains(element)
    System.out.println("Contains 'b'? " + list.contains("b"));

    // indexOf(element)
    System.out.println("Index of 'b': " + list.indexOf("b"));

    // size()
    System.out.println("Size: " + list.size());

    // isEmpty()
    System.out.println("Is empty? " + list.isEmpty());

    // toString()
    System.out.println("List as String: " + list.toString());

    // clear()
    list.clear();
    System.out.println("After clear(): " + list);
    System.out.println("Is empty now? " + list.isEmpty());

    // Convert back to Array
    String[] newArray = list.toArray(new String[0]);
    System.out.println("Converted back to Array (length): " + newArray.length);

  }
}
