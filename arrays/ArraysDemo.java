package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // 1D Array
    int[] oneDArr = new int[5];

    for (int i = 0; i < oneDArr.length; i++) {
      oneDArr[i] = s.nextInt();
    }

    System.out.print("1D Array: ");
    for (int n : oneDArr) {
      System.out.print(n + " ");
    }

    // 2D array
    int[][] matrix = {
        { 1, 2 },
        { 3, 4 }
    };

    System.out.println("Matrix:");
    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }

    // Jagged array
    int[][] jaggedArray = {
        { 1, 2, 3 },
        { 4, 5 },
        { 6, 7, 8, 9 }
    };

    for (int i = 0; i < jaggedArray.length; i++) {
      for (int j = 0; j < jaggedArray[i].length; j++) {
        System.out.print(jaggedArray[i][j] + " ");
      }
      System.out.println();
    }

    // Utility methods

    int[] orgArr = { 5, 2, 9, 1, 4 };

    System.out.println("Original Array: " + Arrays.toString(orgArr));

    // Create a copy of the original array
    int[] coppiedArr = Arrays.copyOf(orgArr, orgArr.length);
    System.out.println("Copied Array: " + Arrays.toString(coppiedArr));

    // Sort the array
    int[] usArr = { 3, 1, 4, 2, 5 };
    Arrays.sort(usArr);
    System.out.println("Sorted Array: " + Arrays.toString(usArr));

    // Search for an element
    int key = 4;
    int index = Arrays.binarySearch(usArr, key);
    if (index >= 0) {
      System.out.println("Element " + key + " found at index: " + index);
    } else {
      System.out.println("Element " + key + " not found in the array.");
    }

    // Fill an array with a specific value
    int[] filledArr = new int[5];
    Arrays.fill(filledArr, 4);
    System.out.println("Filled Array: " + Arrays.toString(filledArr));

    // Comparing arrays
    int[] a = { 1, 2, 3 };
    int[] b = { 1, 2, 3 };
    System.out.println("Arrays.equals(a, b): " + Arrays.equals(a, b));

    s.close();

  }
}
