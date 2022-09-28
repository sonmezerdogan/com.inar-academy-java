package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_21 {

    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount of loan : ");
        double loan=sc.nextDouble();
        System.out.println("Enter number of year : ");
        int year= sc.nextInt();
        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for(double i=5.0; i<=8.0; i+=0.125){
            System.out.printf("%.3f",i);
            System.out.print("%");
            double monthlyInterestRate = i / 1200;
            double monthlyPayment = loan * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, year * 12));
            double totalPayment = monthlyPayment * year * 12;
            System.out.printf("%17.2f", monthlyPayment);
            System.out.printf("%21.2f", totalPayment);
            System.out.println();

        }

    }
}
