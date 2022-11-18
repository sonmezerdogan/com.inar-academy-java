package chapters.chapter_06;

public class Exercise6_01 {

    public static void main(String[]args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.printf("%7d\n", getPentagonalNumbers(i));
            }else
                System.out.printf("%7d", getPentagonalNumbers(i));

        }

    }
    public static int getPentagonalNumbers(int n){

       return n*(3*n-1)/2;

    }
}
