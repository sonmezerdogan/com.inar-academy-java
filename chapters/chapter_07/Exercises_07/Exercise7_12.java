package chapters.chapter_07.Exercises_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ten numbers : ");
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();

        }
        int[] list2= reverse(list);
        System.out.print(Arrays.toString(list2));

    }
    public static int[] reverse(int[] list){

        int temp;
        for (int i = 0, j = list.length - 1; i < j; i++, j--) {
            temp = list[i];
            list[i] = list[j];
            list[j] = temp;

        }
        return list;
    }
}
