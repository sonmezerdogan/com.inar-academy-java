package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_16 {

    public static void main(String[] ards) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its smallest factors : ");
        int number = sc.nextInt();

        for (int divisor = 2; divisor < number; divisor++) {
            while (number % divisor == 0) {
                number = number / divisor;
                System.out.print(divisor + " ");

                if (number % divisor != 0) {
                    divisor++;
                }
            }


        }
    }

}
