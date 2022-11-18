package chapters.chapter_06;

public class Exercise6_10 {
    public static void main(String[] args) {
        System.out.println("The Prime Numbers Which Smaller Than 10_000 : ");
        printPrimeNumbers(2);
    }



    public static void printPrimeNumbers(int number) {

        int num=2;
        int count=0;
        while(num<=10000){
            if(isPrime(num)){
                count++;
                if(count%20==0){
                    System.out.printf("%-8s\n",num);
                    num++;
                }
                else
                    System.out.printf("%-8s", num);
            }
            num++;
        }
    }
    public static boolean isPrime(int number) {
        for(int divisor=2; divisor<=number/2; divisor++){
            if(number%divisor==0){
                return false;
            }
        }
        return true;

    }
}
