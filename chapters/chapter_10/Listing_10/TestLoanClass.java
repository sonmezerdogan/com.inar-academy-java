package chapters.chapter_10.Listing_10;

import java.util.Scanner;

public class TestLoanClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter annual interest rate, for example(7.75) :");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter number of years :");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount :");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());

    }
}
