package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_37 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a decimal number number :");
        int decNumber= sc.nextInt();
        int binNumber;
        int i=0;
        while(decNumber/(int)Math.pow(2,i)>=2){
            binNumber=decNumber/((int)Math.pow(2,i))%2;
            i++;

           System.out.print(binNumber+"");
            if(decNumber/(int)Math.pow(2,i)<2){
                System.out.print(1);

            }
        }
    }
}
