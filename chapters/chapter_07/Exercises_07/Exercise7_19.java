package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of elements : ");
        int number = input.nextInt();
        int[] array = new int[number];
        System.out.println(" Enter the numbers of list including integer numbers");

        for (int i = 0; i < number; i++) {
            array[i] = input.nextInt();
        }
        isSorted(array);
        System.out.println("Array is" + (isSorted(array) ? "" : " not ") + " a sorted array");

    }

    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (!(list[i] < list[j])) {
                    return false;


                }

            }

        }
        return true;


    }
}