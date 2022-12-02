package chapters.chapter_12.Exercises_12.E03;

import java.util.Scanner;

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = getArray(100);
        int i = 0;
        while (i <100) {
            System.out.println("Enter an index of array");
            i = input.nextInt();
            try {
                System.out.println(i + " is " + array[i]);
            } catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Out of Bounds");
                System.exit(0);
            }
        }

    }
    private static int[] getArray(int num) {
        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*1000);
        }
        return array;
    }
}
