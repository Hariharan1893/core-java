package methods;

public class MethodsDemo {

  int mul(int a, int b) {
    return a * b;
  }

  void hello() {
    System.out.println("hello: Hello, World!");
  }

  void printMessage(String message) {
    System.out.println("printMessage: " + message);
  }

  static void swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
    System.out.println("swap: a = " + a + ", b = " + b);
  }

  static void printSeq(int... numbers) {
    for (int number : numbers) {
      System.out.print(number + " ");
    }
  }

  // overloaded methods

  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  double add(double a, double b) {
    return a + b;
  }

  public static void main(String[] args) {

    MethodsDemo methodsDemo = new MethodsDemo();

    // 1. Method with parameters and return type
    int sum = methodsDemo.mul(5, 5);
    System.out.println("add: " + sum);

    // 2. Method with parameters and no return type
    methodsDemo.printMessage("Hello all");

    // 3. Method with no parameters and no return type
    methodsDemo.hello();

    // 4. Static method with parameters and no return type
    int a = 10;
    int b = 20;
    MethodsDemo.swap(a, b);

    // 5. Static method with variable number of arguments
    printSeq(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    System.out.println();

    // 6. Overloaded methods
    int result1 = methodsDemo.add(5, 10);
    int result2 = methodsDemo.add(5, 10, 15);
    double result3 = methodsDemo.add(5.5, 10.5);

    System.out.println("Overloaded add (int, int): " + result1);

    System.out.println("Overloaded add (int, int, int): " + result2);

    System.out.println("Overloaded add (double, double): " + result3);

  }
}
