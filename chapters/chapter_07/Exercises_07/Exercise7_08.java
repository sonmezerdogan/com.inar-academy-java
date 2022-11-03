package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        double average = average(numbers);
        System.out.println("Average : "+average);
    }
    public static int average(int[] array){
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        return sum/array.length;
    }
    public static double average(double[] array){
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        return sum/array.length;
    }
}
