package chapters.chapter_07;

import java.util.Scanner;

public class analyzeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of items:");
        int n=sc.nextInt();
        double[] numbers= new double[n];
        double sum=0;
        System.out.println("Enter the numbers: ");
        for(int i=0; i<numbers.length; i++){
            numbers[i]= sc.nextDouble();
            sum+=numbers[i];
        }
        double average=sum/n;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(numbers[i]>average){
                count++;
            }
        }
        System.out.println("The average: "+average);
        System.out.println("The numbers above average: "+count);
        System.out.println("The numbers below average: "+(n-count));

    }
}
