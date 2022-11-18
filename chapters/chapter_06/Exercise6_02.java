package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_02 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();

        System.out.println(sumDigits(num));

    }
    public static int sumDigits(int n){
        int sum=0;
        int x=0;

        while((n/Math.pow(10,x))>1) {
            sum += (n / Math.pow(10, x)) % 10;
            x++;
        }
        return sum;
    }
}
