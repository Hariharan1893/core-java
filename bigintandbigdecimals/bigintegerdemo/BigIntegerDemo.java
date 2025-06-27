package bigintandbigdecimals.bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        // Create BigInteger objects from string
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("98765432109876543210");

        // 1. add()
        BigInteger sum = a.add(b);
        System.out.println("add(): " + sum); // a + b

        // 2. subtract()
        BigInteger diff = b.subtract(a);
        System.out.println("subtract(): " + diff); // b - a

        // 3. multiply()
        BigInteger product = a.multiply(b);
        System.out.println("multiply(): " + product); // a * b

        // 4. divide()
        BigInteger quotient = b.divide(a);
        System.out.println("divide(): " + quotient); // b / a (integer division)

        // 5. mod()
        BigInteger remainder = b.mod(a);
        System.out.println("mod(): " + remainder); // b % a

        // 6. pow()
        BigInteger power = new BigInteger("2").pow(10); // 2^10 = 1024
        System.out.println("pow(): " + power);

        // 7. gcd()
        BigInteger x = new BigInteger("48");
        BigInteger y = new BigInteger("18");
        BigInteger gcd = x.gcd(y);
        System.out.println("gcd(): " + gcd); // GCD of 48 and 18 = 6

        // 8. isProbablePrime(int certainty)
        BigInteger primeCheck = new BigInteger("97");
        System.out.println("isProbablePrime(): " + primeCheck.isProbablePrime(10)); // true

        // 9. compareTo()
        int result = a.compareTo(b); // a < b → -1, a == b → 0, a > b → 1
        System.out.println("compareTo(): " + result);
    }
}
