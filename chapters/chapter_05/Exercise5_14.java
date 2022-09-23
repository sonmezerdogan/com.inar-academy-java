package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_14 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number to find the gcd: ");
        int k= sc.nextInt();
        System.out.println("Enter second number to find the gcd: ");
        int l= sc.nextInt();
        int d=Math.min(k,l);

        while(d>2) {


            if (k % d == 0 && l % d == 0) {
                System.out.println(d + " is the gcd of " + k + " and " + l);

            }
            d--;


            }
        if (k % d != 0 && l % d != 0) {

            System.out.println("1 is the gcd of " + k + " and " + l);


        }


    }
}
