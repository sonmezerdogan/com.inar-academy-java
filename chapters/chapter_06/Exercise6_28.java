package chapters.chapter_06;

public class Exercise6_28 {
    public static void main(String[] args) {
        System.out.println("p      2^p-1");
        System.out.println("------------");
        int num = 2;
        while (num <= 31) {
            if ((isPrime(num))) {
                if (isPrime((int)(Math.pow(2,num)-1))) {
                    System.out.printf("%-8d%-8d\n",num,(int)(Math.pow(2,num)-1));
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
