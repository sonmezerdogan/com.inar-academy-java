package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_07 {

    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
/*
The amount invested: 1000
Annual interest rate: 9
Years Future Value
1 1093.80
2 1196.41
...
29 13467.25
30 14730.57
 */
        System.out.print("Enter investment amount: ");

        double amount = sc.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");

        double annualInterestRate = sc.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        System.out.println("The amount invested :" + amount);
        System.out.println("Annual interest rate :" + annualInterestRate);
        System.out.println("Years    Future Value");

        int year;
        for (year = 1; year <= 30; year++) {
            System.out.printf("%-2d",year);
            System.out.printf("%15.2f         ",futureInvestmentValue(amount, monthlyInterestRate, year));
            System.out.println();
        }


        }
        public static double futureInvestmentValue (double amount, double monthlyInterestRate, int year){
            return amount * Math.pow(1 + monthlyInterestRate, year * 12);


        }



}
