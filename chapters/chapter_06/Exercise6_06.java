package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_06 {
    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number= sc.nextInt();

        for(int i=1; i<=number; i++){
            firstTriangle(number, i);
            secondTriangle(number, i);
            System.out.println();
        }

    }
    public static void firstTriangle(int num, int i){
        for(int j=num-1; j>=i; j--){
            System.out.print("  ");
        }
    }
    public static void secondTriangle(int num, int i){
        for(int k=i; k>=1; k--){
            System.out.print(k+" ");
        }

    }
}
