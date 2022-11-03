package chapters.chapter_07.Exercises_07;

import chapters.chapter_07.Listing_07.Listing7_6;
import chapters.chapter_07.Listing_07.Listing7_7;

import java.util.*;

public class Exercise7_16 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100_000_000);
        }
        Arrays.sort(array);
        long startTime = System.currentTimeMillis();
        Listing7_7.binarySearch(array, (int)(Math.random()*10_000_000));
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of binary search of array is: "+ executionTime+ " milliseconds");

        startTime = System.currentTimeMillis();
        Listing7_6.linearSearch(array, (int)(Math.random()*10_000_000));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time of linear search of array is: "+ executionTime+ " milliseconds");
    }


}
