package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_36 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first 9 digits of ISBN number :");
        int num= sc.nextInt();
        int sum=0;
        for(int i=0; i<=9; i++)
            sum+=(i+1)*(num/(int)Math.pow(10,i))%10;
        if(sum%11==10){
            System.out.print(num+""+"X");
        }else{
            System.out.println(num+""+sum%11);

        }



    }



}
