package chapters.chapter_10.Exercises_10.E18;

import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        fivePrimesBiggerLongMaxvalue();
    }
    public static void fivePrimesBiggerLongMaxvalue() {
        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE));
        int count = 0;
        while (count < 5) {

            System.out.println(number.nextProbablePrime());
            number = number.nextProbablePrime();
            count++;
        }
    }
}
