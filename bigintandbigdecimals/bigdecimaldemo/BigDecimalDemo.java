package bigintandbigdecimals.bigdecimaldemo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        // Create BigDecimal from string (always prefer string for accuracy)
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal quantity = new BigDecimal("3");

        // 1. add()
        BigDecimal total = price.add(new BigDecimal("5.00")); // 19.99 + 5.00
        System.out.println("add(): " + total); // 24.99

        // 2. subtract()
        BigDecimal discount = total.subtract(new BigDecimal("4.99")); // 24.99 - 4.99
        System.out.println("subtract(): " + discount); // 20.00

        // 3. multiply()
        BigDecimal finalCost = discount.multiply(quantity); // 20.00 * 3
        System.out.println("multiply(): " + finalCost); // 60.00

        // 4. divide() with scale and rounding
        BigDecimal average = finalCost.divide(quantity, 2, RoundingMode.HALF_UP);
        System.out.println("divide(): " + average); // 60.00 / 3 = 20.00

        // 5. setScale() to control decimal places
        BigDecimal tax = new BigDecimal("15.4567");
        BigDecimal roundedTax = tax.setScale(2, RoundingMode.DOWN); // truncate to 2 decimal places
        System.out.println("setScale(): " + roundedTax); // 15.45

        // 6. compareTo() — returns -1, 0, or 1
        BigDecimal a = new BigDecimal("100");
        BigDecimal b = new BigDecimal("200");

        int comparison = a.compareTo(b); // a < b → -1
        System.out.println("compareTo(): " + comparison);

        // 7. round() using MathContext
        BigDecimal value = new BigDecimal("123.456789");
        BigDecimal rounded = value.round(new MathContext(5, RoundingMode.HALF_UP)); // 5 digits precision
        System.out.println("round(): " + rounded); // 123.46
    }
}
