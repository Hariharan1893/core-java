package collectionsdemo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Collectionsdemo {

    // List Interface is implemented by ArrayList, LinkedList, and Vector -> Stack

    public static void ArrayListDemo() {

        List<String> list = new ArrayList<>();

        // adding elements to the ArrayList

        list.add("Hari");
        list.add("chiya");
        list.add("valar");
        list.add("ahaa");
        list.add("ragu");

        System.out.println("ArrayList after adding elements: " + list);

        // size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        // adding an element at a specific index
        list.add(2, "adhi");
        System.out.println("Arrayist after adding elements: " + list);

        // removing an element from the Arrayist
        list.remove("valar");
        System.out.println("ArrayList after removing an element: " + list);

        // remove an element at a specific index
        list.remove(4);
        System.out.println("ArrayList after removing an element at index 4: " + list);

        // checking if the ArrayList contains an element
        boolean containsElement = list.contains("ragu");

        System.out.println("Does the ArrayList contain 'ragu'? " + containsElement);

        System.out.println("---------------------------------------------------");
    }

    public static void LinkedListDemo() {

        List<Integer> list = new LinkedList<>();

        // adding elements to the LinkedList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("LinkedList after adding elements: " + list);

        // size of the LinkedList
        System.out.println("Size of the LinkedList: " + list.size());

        // adding an element at a specific index
        list.add(2, 25);
        System.out.println("LinkedList after adding an element at index 2: " + list);

        // removing an element from the LinkedList
        list.remove(Integer.valueOf(40));
        System.out.println("LinkedList after removing an element: " + list);

        // remove an element at a specific index
        list.remove(3);
        System.out.println("LinkedList after removing an element at index 3: " + list);

        // checking if the LinkedList contains an element
        boolean containsElement = list.contains(30);
        System.out.println("Does the LinkedList contain '30'? " + containsElement);

        System.out.println("---------------------------------------------------");

    }

    public static void VectorDemo() {

        Vector<String> names = new Vector<>();
        names.add("Hari");
        names.add("John");
        names.add("Hari");

        System.out.println("Vector elements: " + names);
        System.out.println("--------------------------------------");
    }

    public static void StackDemo() {

        Stack<String> stack = new Stack<>();

        // pushing elements onto the stack
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack after pushing elements: " + stack);

        // popping an element from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after popping an element: " + stack);

        // peeking at the top element of the stack
        String topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        System.out.println("--------------------------------------");
    }

    // Queue and Deque interfaces are implemented by ArrayDeque, PriorityQueue

    public static void PriorityQueueDemo() {
        System.out.println("PriorityQueue Demo (Min-Heap):");

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.offer(5); // adds element like add()

        System.out.println("PriorityQueue: " + pq);

        // Peek without removing
        System.out.println("Peek (top priority): " + pq.peek());

        // Remove elements
        System.out.println("Poll (remove top priority): " + pq.poll());
        System.out.println("Poll: " + pq.poll());

        // Check if contains
        System.out.println("Contains 30? " + pq.contains(30));

        System.out.println("Remaining Queue: " + pq);

        System.out.println("---------------------------------------------------");
    }

    public static void ArrayDequeStack() {
        System.out.println("ArrayDeque as Stack (LIFO):");

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushes: " + stack);

        System.out.println("Top element (peek): " + stack.peek());

        // Pop elements
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        // Add more elements
        stack.push(50);

        // Contains check
        System.out.println("Contains 20? " + stack.contains(20));

        // Size check
        System.out.println("Size: " + stack.size());

        System.out.println("Final Stack: " + stack);
        System.out.println("---------------------------------------------------");

    }

    public static void ArrayDequeQueue() {
        System.out.println("ArrayDeque as Queue (FIFO):");

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(10); // enqueue
        deque.addLast(20);
        deque.addFirst(5); // optional front insert

        System.out.println("Queue after enqueues: " + deque);

        // Peek front
        System.out.println("Peek Front: " + deque.peekFirst());

        // Poll front and rear
        System.out.println("Poll Front: " + deque.removeFirst());
        System.out.println("Poll Rear: " + deque.removeLast());

        // Add more elements
        deque.offerLast(25);
        deque.offerLast(35);

        // Size
        System.out.println("Size: " + deque.size());

        // Contains
        System.out.println("Contains 25? " + deque.contains(25));

        System.out.println("Final Queue: " + deque);
        System.out.println("---------------------------------------------------");

    }

    // Set interfacce is implemented by HashSet, LinkedHashSet, and TreeSet and sub
    // Interface : SortedSet

    public static void HashSetDemo() {

        Set<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Hari");
        hashSet.add("Adhi");
        hashSet.add("Ahana");
        hashSet.add("Ragu");
        hashSet.add("Chiya");

        System.out.println("HashSet after adding elements: " + hashSet);

        // Checking if an element exists

        System.out.println("Does the HashSet contain 'Hari'? " + hashSet.contains("Hari"));

        // Removing an element
        hashSet.remove("Chiya");
        System.out.println("HashSet after removing 'Chiya': " + hashSet);

        // Size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");

        for (String name : hashSet) {
            System.out.println(name);
        }

        System.out.println("---------------------------------------------------");

    }

    public static void LinkedHashSetDemo() {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(50);
        linkedHashSet.add(20); // Duplicate, will not be added

        System.out.println("LinkedHashSet after adding elements: " + linkedHashSet);

        // Checking if an element exists

        System.out.println("Does the LinkedHashSet contain '30'? " + linkedHashSet.contains(30));

        // Removing an element
        linkedHashSet.remove(40);

        System.out.println("LinkedHashSet after removing '40': " + linkedHashSet);

        // Size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + linkedHashSet.size());

        // Iterating through the LinkedHashSet

        System.out.println("Iterating through the LinkedHashSet:");
        for (Integer number : linkedHashSet) {
            System.out.println(number);
        }

        System.out.println("---------------------------------------------------");

    }

    public static void SetTreeSetDemo() {
        // TreeSet is a part of the Java Collections Framework and implements the Set
        // interface.
        // It stores elements in a sorted order and does not allow duplicate elements.

        Set<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(40);
        // Duplicate elements will not be added
        treeSet.add(20);

        System.out.println("TreeSet after adding elements: " + treeSet);

        // Checking if an element exists
        System.out.println("Does the TreeSet contain '30'? " + treeSet.contains(30));

        // Removing an element
        treeSet.remove(20);
        System.out.println("TreeSet after removing '20': " + treeSet);

        // Size of the TreeSet
        System.out.println("Size of the TreeSet: " + treeSet.size());

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (Integer number : treeSet) {
            System.out.println(number);
        }

        System.out.println("---------------------------------------------------");
    }

    public static void SortedSetTreeSetDemo() {
        // SortedSet is an interface that extends Set and provides additional methods
        // for sorted sets.
        // TreeSet implements the SortedSet interface.

        // Using TreeSet (which implements SortedSet)
        SortedSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(60);

        System.out.println("Original SortedSet: " + numbers); // Automatically sorted

        // 1. first() – Smallest element
        System.out.println("First (Smallest): " + numbers.first());

        // 2. last() – Largest element
        System.out.println("Last (Largest): " + numbers.last());

        // 3. headSet(E toElement) – Elements < 40
        SortedSet<Integer> head = numbers.headSet(40);
        System.out.println("HeadSet (elements < 40): " + head);

        // 4. tailSet(E fromElement) – Elements ≥ 30
        SortedSet<Integer> tail = numbers.tailSet(30);
        System.out.println("TailSet (elements >= 30): " + tail);

        // 5. subSet(E from, E to) – Elements from 20 (inclusive) to 50 (exclusive)
        SortedSet<Integer> sub = numbers.subSet(20, 50);
        System.out.println("SubSet (20 to 50): " + sub);

        System.out.println("---------------------------------------------------");
    }

    // Map interfaces is implemented by HashMap, LinkedHashMap, SortedMap,
    // NavigableMap and TreeMap

    public static void HashMapDemo() {

        Map<Integer, Character> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap}
        hashMap.put(1, 'A');
        hashMap.put(2, 'B');
        hashMap.put(3, 'C');
        hashMap.put(4, 'D');
        hashMap.put(5, 'E');
        hashMap.put(6, 'F');
        hashMap.put(7, 'G');

        System.out.println("HashMap after adding elements: " + hashMap);

        // Checking if a key exists
        System.out.println("Does the HashMap contain key '3'? " + hashMap.containsKey(3));

        // Checking if a value exists
        System.out.println("Does the HashMap contain value 'D'? " + hashMap.containsValue('D'));

        // Removing a key-value pair
        hashMap.remove(4);
        System.out.println("HashMap after removing key '4': " + hashMap);

        // Getting a value by key
        Character value = hashMap.get(2);
        System.out.println("Value for key '2': " + value);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<Integer, Character> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());

        System.out.println("---------------------------------------------------");

    }

    public static void LinkedHashMap() {

        Map<String, Integer> linkedHashMap = new HashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);
        linkedHashMap.put("Date", 4);
        linkedHashMap.put("Elderberry", 5);

        System.out.println("LinkedHashMap after adding elements: " + linkedHashMap);

        // Checking if a key exists
        System.out.println("Does the LinkedHashMap contain key 'Cherry'? " + linkedHashMap.containsKey("Cherry"));

        // Checking if a value exists
        System.out.println("Does the LinkedHashMap contain value '4'? " + linkedHashMap.containsValue(4));

        // Removing a key-value pair
        linkedHashMap.remove("Banana");
        System.out.println("LinkedHashMap after removing key 'Banana': " + linkedHashMap);

        // Getting a value by key
        Integer value = linkedHashMap.get("Date");
        System.out.println("Value for key 'Date': " + value);

        // Iterating through the LinkedHashMap
        System.out.println("Iterating through the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size of the LinkedHashMap
        System.out.println("Size of the LinkedHashMap: " + linkedHashMap.size());

        System.out.println("---------------------------------------------------");

    }

    public static void SortedMapDemo() {

        SortedMap<Integer, String> map = new TreeMap<>();

        // Adding key-value pairs to the SortedMap
        map.put(100, "Hari");
        map.put(50, "John");
        map.put(75, "Ravi");

        System.out.println("SortedMap after adding elements: " + map);

        System.out.println("SortedMap first key" + map.firstKey()); // 50
        System.out.println("SortedMap last key: " + map.lastKey()); // 100
        System.out.println("SortedMap headMap(75): " + map.headMap(75)); // {50=John}
        System.out.println("SortedMap tailMap(75): " + map.tailMap(75)); // {75=Ravi, 100=Hari}
        System.out.println(map.subMap(50, 100)); // {50=John, 75=Ravi}

        System.out.println("---------------------------------------------------");

    }

    public static void NavigableMapDemo() {
        // Create a TreeMap (implements NavigableMap)
        NavigableMap<Integer, String> map = new TreeMap<>();

        // Add entries
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");

        System.out.println("Original Map: " + map);

        // lowerKey(K key) – Greatest key < key
        System.out.println("lowerKey(25): " + map.lowerKey(25)); // 20

        // floorKey(K key) – Greatest key ≤ key
        System.out.println("floorKey(30): " + map.floorKey(30)); // 30
        System.out.println("floorKey(25): " + map.floorKey(25)); // 20

        // ceilingKey(K key) – Smallest key ≥ key
        System.out.println("ceilingKey(25): " + map.ceilingKey(25)); // 30
        System.out.println("ceilingKey(30): " + map.ceilingKey(30)); // 30

        // higherKey(K key) – Smallest key > key
        System.out.println("higherKey(30): " + map.higherKey(30)); // 40

        // descendingMap() – Reverse order
        System.out.println("Descending Map: " + map.descendingMap()); // {50=E, 40=D, 30=C, 20=B, 10=A}

        // pollFirstEntry() – Remove and return first entry
        Map.Entry<Integer, String> firstEntry = map.pollFirstEntry();
        System.out.println("Polled First Entry: " + firstEntry);
        System.out.println("After pollFirstEntry: " + map);

        // pollLastEntry() – Remove and return last entry
        Map.Entry<Integer, String> lastEntry = map.pollLastEntry();
        System.out.println("Polled Last Entry: " + lastEntry);
        System.out.println("After pollLastEntry: " + map);

        System.out.println("---------------------------------------------------");

    }

    public static void TreeMapDemo() {

        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        treeMap.put("Date", 4);
        treeMap.put("Elderberry", 5);

        System.out.println("TreeMap after adding elements: " + treeMap);

        // Checking if a key exists
        System.out.println("Does the TreeMap contain key 'Cherry'? " + treeMap.containsKey("Cherry"));

        // Checking if a value exists
        System.out.println("Does the TreeMap contain value '4'? " + treeMap.containsValue(4));

        // Removing a key-value pair
        treeMap.remove("Banana");
        System.out.println("TreeMap after removing key 'Banana': " + treeMap);

        // Getting a value by key
        Integer value = treeMap.get("Date");
        System.out.println("Value for key 'Date': " + value);

        // Iterating through the TreeMap
        System.out.println("Iterating through the TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size of the TreeMap
        System.out.println("Size of the TreeMap: " + treeMap.size());

        System.out.println("---------------------------------------------------");
    }

    // Collections utility methods are used to perform operations on collections

    public static void CollectionsUtilityDemo() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 50, 30, 20, 40));

        Collections.sort(list);
        System.out.println("Sorted: " + list); // [10, 20, 30, 40, 50]

        Collections.reverse(list);
        System.out.println("Reversed: " + list); // [50, 40, 30, 20, 10]

        Collections.shuffle(list);
        System.out.println("Shuffled: " + list); // Random order

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Frequency of 30: " + Collections.frequency(list, 30));

        System.out.println("---------------------------------------------------");
    }

    // Iterable Interface is implemented by all the collections, for iterating
    // element one by one.

    public static void IterableDemo() {
        List<String> iterableList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

        System.out.println("Iterating using for-each loop:");
        for (String element : iterableList) {
            System.out.println(element);
        }

        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = iterableList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // ListIterator for bidirectional iteration

        System.out.println("Iterating using ListIterator:");

        List<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));

        ListIterator<String> li = list.listIterator();

        System.out.println("Forward iteration:");

        while (li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("Backward iteration:");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }

        System.out.println("---------------------------------------------------");
    }

    public static void main(String[] args) {

        System.out.println("ArrayList Demo");

        ArrayListDemo();

        System.out.println("LinkedList Demo");

        LinkedListDemo();

        System.out.println("Vector Demo");

        VectorDemo();

        System.out.println("Stack Demo");

        StackDemo();

        System.out.println("PriorityQueue Demo");

        PriorityQueueDemo();

        System.out.println("ArrayDeque as Stack Demo");

        ArrayDequeStack();

        System.out.println("ArrayDeque as Queue Demo");

        ArrayDequeQueue();

        System.out.println("HashSet Demo");

        HashSetDemo();

        System.out.println("LinkedHashSet Demo");

        LinkedHashSetDemo();

        System.out.println("TreeSet Demo");

        SetTreeSetDemo();

        System.out.println("SortedSet TreeSet Demo");

        SortedSetTreeSetDemo();

        System.out.println("HashMap Demo");

        HashMapDemo();

        System.out.println("LinkedHashMap Demo");

        LinkedHashMap();

        System.out.println("SortedMap Demo");

        SortedMapDemo();

        System.out.println("NavigableMap Demo");

        NavigableMapDemo();

        System.out.println("TreeMap Demo");

        TreeMapDemo();

        System.out.println("Collections Utility Demo");

        CollectionsUtilityDemo();

        System.out.println("Iterable Demo");

        IterableDemo();

    }

}
