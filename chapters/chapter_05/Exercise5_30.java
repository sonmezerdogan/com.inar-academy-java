package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_30 {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount you save each month :");
        double amount = sc.nextDouble();
        System.out.println("Enter the number of months");
        int month = sc.nextInt();
        System.out.println("Enter the annual rate(eg:enter 5 for 5%");
        double rate = sc.nextDouble();
        double totalAmount=0;
        for (int i = 1; i <= month; i++) {
                totalAmount = (amount+totalAmount)+((amount+totalAmount)*rate / 1200);



            }
        System.out.printf("%.3f\n",totalAmount);





    }
}
