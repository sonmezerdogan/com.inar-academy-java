package chapters.chapter_10.Exercises_10.E16;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {
        Long number = Long.MAX_VALUE;

        displayFirstTenNumberBiggerThanLongMaxDivisibleBoth5And6(number.toString());

    }

    public static void displayFirstTenNumberBiggerThanLongMaxDivisibleBoth5And6(String s) {

        BigInteger number = new BigInteger(s);
        BigInteger divisor2 = new BigInteger("5");
        BigInteger divisor3 = new BigInteger("6");
        BigInteger zero = new BigInteger("0");

        int count = 0;
        while (count < 10) {
            if (number.remainder(divisor2).compareTo(zero) == 0 || number.remainder(divisor3).compareTo(zero) == 0) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }

    }
}
