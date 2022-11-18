package chapters.chapter_10.Exercises_10.E19;

import java.math.BigInteger;


public class Exercise10_19 {
    public static void main(String[] args) {
        displayFirst100MersennePrime();
    }

    public static void displayFirst100MersennePrime() {
        System.out.printf("%-10s | %-10s\n", "p", "2^p - 1");

        int count = 0;
        BigInteger number = new BigInteger("2");

        while (count < 100) {
            if (isMersennePrime(number)) {
                System.out.printf("%-10d | %-10d\n", number, get2PowNumber(number).subtract(BigInteger.ONE));
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isMersennePrime(BigInteger number) {

        return isPrime(number) && isPrime(get2PowNumber(number).subtract(BigInteger.ONE));
    }

    private static boolean isPrime(BigInteger number) {
        BigInteger stop = number.divide(new BigInteger("2")).add(BigInteger.ONE);
        BigInteger divisor = new BigInteger("2");
        BigInteger zero = new BigInteger("0");
        while (divisor.compareTo(stop) != 0) {
            if (number.remainder(divisor).compareTo(zero) == 0) {
                return false;
            }
            divisor = divisor.add(BigInteger.ONE);
        }
        return true;
    }

    public static BigInteger get2PowNumber(BigInteger number) {
        BigInteger result = new BigInteger("2");
        BigInteger start = new BigInteger("1");

        while (start.compareTo(number) != 0) {
            result = result.multiply(new BigInteger("2"));
            start = start.add(BigInteger.ONE);
        }
        return result;
    }
}
