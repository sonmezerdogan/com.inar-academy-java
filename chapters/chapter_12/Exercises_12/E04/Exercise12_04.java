package chapters.chapter_12.Exercises_12.E04;

import java.util.Scanner;

public class Exercise12_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter annual interest rate");
            double interestRate = input.nextDouble();
            System.out.println("Enter number of years");
            int numberOfYears = input.nextInt();
            System.out.println("Enter loan amount");
            double loanAmount = input.nextDouble();
            try {
                LoanWithException loanWithException = new LoanWithException(interestRate, numberOfYears, loanAmount);
                System.out.println(loanWithException.getTotalPayment());
                break;
            }catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
