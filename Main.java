import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // Scanner to read input
//        String input = scanner.next(); // Read input as string
//        BigInteger n = new BigInteger(input); // Convert to BigInteger
//        weirdAlgo(n);
//        scanner.close();

    }

    static void weirdAlgo(BigInteger n) {
        System.out.print(n + " ");
        BigInteger one = BigInteger.ONE;
        BigInteger two = new BigInteger("2");
        BigInteger three = new BigInteger("3");

        while (n.compareTo(one) > 0) {
            if (n.mod(two).equals(BigInteger.ZERO)) {
                n = n.divide(two);
            } else {
                n = n.multiply(three).add(one);
            }
            System.out.print(n + " ");
        }
    }


}


