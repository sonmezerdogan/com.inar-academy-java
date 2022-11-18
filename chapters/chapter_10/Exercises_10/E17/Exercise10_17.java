package chapters.chapter_10.Exercises_10.E17;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        displaySquareNumbers(10);
    }

    public static void displaySquareNumbers(int i) {
        long sqrt = (long) (Math.sqrt(Long.MAX_VALUE));
        BigInteger number = new BigInteger(String.valueOf(sqrt));
        for (int j = 1; j <= i; j++) {
            number=number.add(BigInteger.ONE);
            System.out.println(number.multiply(number));
        }
    }
}
