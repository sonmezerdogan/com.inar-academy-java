package chapters.chapter_10.Exercises_10.E20;

import javax.swing.text.Position;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise10_20 {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal e = BigDecimal.ONE;
            for (int j = 1; j < i; j++) {
                BigDecimal increase = BigDecimal.ONE.divide(factor(j), 25, BigDecimal.ROUND_UP);
                e = e.add(increase);
            }
            System.out.println(i + " --> " + e);
        }
    }

    public static BigDecimal factor(long n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigDecimal(i + ""));
        }
        return result;
    }

}
