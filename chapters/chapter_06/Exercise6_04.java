package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_04 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number to reverse it , ");
        int number= sc.nextInt();
        reverse(number);

    }
    public static void reverse(int number) {
        while (number > 0) {
            System.out.print(number % 10);
            number = (number / 10);
        }
    }
}
