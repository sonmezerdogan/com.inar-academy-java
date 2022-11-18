package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        printMatrix(number);
    }
    public static void printMatrix(int number){
        for(int i=1; i<=number; i++){
            for(int j=1; j<=number; j++){
                System.out.print(Math.round(Math.random())+" ");
            }
            System.out.println();

        }

    }

}
