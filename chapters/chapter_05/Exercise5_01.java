package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_01 {

    public static void main(String[]args){

        double sum=0;
        int negCount=0;
        int pozCount=0;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a number : ");

        int number=sc.nextInt();
        if(number==0){
            System.out.println("You did not enter except zero!");
            System.exit(1);
        }
        while(number!=0){
            sum+=number;

            if(number<0) {
                negCount++;
            }
            if(number>0){
                pozCount++;
            }
            number=sc.nextInt();

        }

        System.out.println("The  number of positives : "+ pozCount);
        System.out.println("The  number of negatives : "+ negCount);
        System.out.println("The  total is : "+ sum);
        System.out.println("The  average is : "+ sum/(negCount+pozCount));


    }
}
