package chapters.chapter_10.Exercises_10.E06;


import chapters.chapter_10.Exercises_10.E05.StackOfIntegers;

public class Exercise10_06 {
    public static void main(String[] args) {
        StackOfIntegers primeNumbersTo120 = new StackOfIntegers();

        int n = 5;
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {

                primeNumbersTo120.push(i);

            }
        }

        System.out.println("All prime numbers less than 120, in reverse order: ");
        int count = 0;
        while (primeNumbersTo120.getSize() >= 1) {
            System.out.print(primeNumbersTo120.pop() + " ");
            count++;
            if (count % 10 == 0 ){
                System.out.println();
            }
        }


    }

    static boolean checkPrime(int num) {
        boolean prime = true;
        for (int f = 2; f * f <= num; f++) {
            if (num % f == 0) {
                prime = false;
                break;
            }
        }
        return prime;

    }
}
