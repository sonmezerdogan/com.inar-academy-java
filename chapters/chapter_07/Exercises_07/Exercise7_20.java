package chapters.chapter_07.Exercises_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double numbers: ");
        double[] array = new double[10];

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        selectionSort(array);
        displaySortedarray(array);

    }
    public static void selectionSort(double[] list) {
        for (int i = list.length-1; i >0; i--) {
             // Find the minimum in the list[i..list.length-1]
             double currentMax = list[i];
             int currentMaxIndex = i;

             for (int j = 0; j < i; j++) {
                    if (currentMax < list[j]) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                    }
                    }

                // Swap list[i] with list[currentMinIndex] if necessary
                if (currentMaxIndex != i) {
                    double temp = list[i];
                    list[i] = list[currentMaxIndex];
                    list[currentMaxIndex] = temp;
                    }
                }
            }
            public static void displaySortedarray(double[] array){
                for (int i = 0; i < array.length; i++) {
                    System.out.print(array[i]+" ");

                }
            }
}
