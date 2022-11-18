package chapters.chapter_06;

public class Exercise6_27 {
    public static void main(String[] args) {
        int count = 1;
        int num = 2;
        while (count <= 100) {
            if ((isPrime(num))) {
                if (isPrime(reverse(num))) {
                    if (isPalindrome(num)) {
                        System.out.print(num + " ");
                        if (count % 10 == 0) {
                            System.out.println();
                        }
                        count++;
                    }
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
        public static int reverse ( int s){
            String strNum = "";
            for (int i = 0; s / (int) Math.pow(10, i) > 0; i++) {
                int r = s / (int) Math.pow(10, i) % 10;
                strNum += r;
            }
            return Integer.parseInt(strNum);
        }
        public static boolean isPalindrome ( int number){
            String n1 = String.valueOf(number);
            String n2 = String.valueOf(reverse(number));
            return !(n1.equals(n2));
        }
}
