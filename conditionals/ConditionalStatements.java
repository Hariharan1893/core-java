package conditionals;

public class ConditionalStatements {
  public static void main(String[] args) {

    // 1. if statement
    int age = 20;
    if (age >= 18) {
      System.out.println("if: You are an adult.");
    }

    // 2. if-else statement
    int number = 5;
    if (number % 2 == 0) {
      System.out.println("if-else: Even");
    } else {
      System.out.println("if-else: Odd");
    }

    // 3. if-else-if ladder
    int marks = 85;
    if (marks >= 90) {
      System.out.println("if-else-if: Grade A");
    } else if (marks >= 75) {
      System.out.println("if-else-if: Grade B");
    } else {
      System.out.println("if-else-if: Grade C");
    }

    // 4. switch statement
    int day = 3;
    switch (day) {
      case 1:
        System.out.println("switch: Monday");
        break;
      case 2:
        System.out.println("switch: Tuesday");
        break;
      case 3:
        System.out.println("switch: Wednesday");
        break;
      default:
        System.out.println("switch: Invalid day");
    }

    // 5. ternary operator
    int speed = 80;
    String status = (speed > 60) ? "ternary: Over Speed" : "ternary: Safe Speed";
    System.out.println(status);
  }
}
