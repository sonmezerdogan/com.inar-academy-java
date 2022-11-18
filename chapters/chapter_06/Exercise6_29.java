package chapters.chapter_06;

public class Exercise6_29 {
    public static void main(String[] args) {
        int num = 3;
        while (num <= 1000) {
            if ((isPrime(num))) {
                if (isPrime(num+2)) {
                    System.out.println("("+num+" , "+(num+2)+")");
                }
            }

            num++;
        }
    }
    public static boolean isPrime ( int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }


}
