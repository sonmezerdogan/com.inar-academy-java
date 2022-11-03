package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten double numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }
        double mean = meanOfNumbers(numbers);
        double deviation = deviationOfNumbers(numbers,mean);
        System.out.println("The mean is : "+mean);

        System.out.println("The standard deviation is : "+deviation);

    }
    public static double deviationOfNumbers(double[] numbers,double mean){
        double deviation = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow((numbers[i]-mean),2);
            deviation = Math.pow((sum/(numbers.length-1)) , 0.5);
        }
        return deviation;
    }
    public static double meanOfNumbers(double[] numbers){
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
            mean = sum/numbers.length;
        }
        return mean;
    }

}
