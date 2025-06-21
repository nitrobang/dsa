import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    static BigInteger missingNumber(BigInteger[] a, BigInteger n) {
        BigInteger sum = BigInteger.ZERO;

        for (BigInteger num : a) {
            sum = sum.add(num);
        }

        // Formula: sum = n(n + 1) / 2
        BigInteger total = n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.TWO);
        return total.subtract(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = new BigInteger(scanner.next()); // Read n
        int size = n.subtract(BigInteger.ONE).intValue(); // Convert to int for array size

        BigInteger[] a = new BigInteger[size];
        for (int i = 0; i < size; i++) {
            a[i] = new BigInteger(scanner.next());
        }

        BigInteger missing = missingNumber(a, n);
        System.out.println(missing);

        scanner.close();
    }
}
