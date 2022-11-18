package chapters.chapter_10.Exercises_10.E05;

import java.util.Scanner;

public class Exercise_05 {
    public static void main(String[] args) {
        int n = getFromUser();
        StackOfIntegers factors = findFactors(n);
        displayFactorsAndReversedIt(factors);

    }


    public static int getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = input.nextInt();

        return number;
    }

    public static StackOfIntegers findFactors(int n) {
        StackOfIntegers factors = new StackOfIntegers();
        int d = 2;
        while (n != 1) {
            if (n % d == 0) {
                factors.push(d);
                n /= d;
            } else {
                d++;
            }
        }
        return factors;
    }

    public static void displayFactorsAndReversedIt(StackOfIntegers factors) {
        StackOfIntegers factorsForReverse = new StackOfIntegers();
        while (!factors.empty()) {
            System.out.print(factors.peek() + " ");
            factorsForReverse.push(factors.pop());
        }
        System.out.println();

    }

}
