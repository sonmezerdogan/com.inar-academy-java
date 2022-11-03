package chapters.chapter_07.Exercises_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_03 {
    public static void main(String[] args) {
        int[] occurence = new int[100];
        countOccurences(occurence);
        displayResult(occurence);
    }

    public static void countOccurences(int[] occurences) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers between 1-100");
        int i = sc.nextInt();
        while (i != 0) {
            if (i >= 1 && i <= 100) {
                occurences[i - 1]++;
            }
            i = sc.nextInt();
        }
    }
    public static void displayResult(int[] occurences) {
        for (int i = 0; i < occurences.length; i++) {
            if (occurences[i] > 0) {
                System.out.println((i + 1) + " occurs " + occurences[i] + ((occurences[i] > 1) ? " times " : " time "));
            }

        }
    }
}
