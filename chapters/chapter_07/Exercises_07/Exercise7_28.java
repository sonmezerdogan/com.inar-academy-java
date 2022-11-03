package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

import static chapters.chapter_07.Exercises_07.Exercise7_26.createArray;

public class Exercise7_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers ");
        int[] list = createArray(10, input);
        printCombinations2of10(list);
    }
    public static void printCombinations2of10(int[] list){
        for (int i = 0; i < list.length-1; i++) {
            for (int j = i+1; j < list.length; j++) {
                System.out.print("{" + list[i] +","+ list[j] + "}");
            }
            System.out.println();

        }
    }
}
