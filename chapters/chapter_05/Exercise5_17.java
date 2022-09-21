package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_17 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number between 1 and 15");
        int numberOfLine= sc.nextInt();

        for(int i=1; i<=numberOfLine; i++){
            int left= numberOfLine-i;

            for(int s=0; s<left; s++){
                System.out.print("   ");
            }
            for(int k=numberOfLine-left; k>=2; k--) {
                System.out.printf("%3d",k);
            }
            for(int j=1; j<=numberOfLine-left; j++){
                System.out.printf("%3d",j);


            }
            System.out.println();

        }
    }
}
