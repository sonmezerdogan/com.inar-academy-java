package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten double numbers : ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }
        double min = min(numbers);
        System.out.println("Minimum number is : "+min);

    }
    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];

                }

            }
        }
        return min;

    }
}
