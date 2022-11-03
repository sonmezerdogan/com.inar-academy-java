package chapters.chapter_07.Exercises_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("First enter the length of list1 and then the elements : ");
        int[] list1 = createList(input.nextInt(), input );
        System.out.println("Now enter the length of list2 and then the elements : ");
        int[] list2 = createList(input.nextInt(), input );
        Arrays.sort(list1);
        Arrays.sort(list2);

        System.out.println("Two lists are "+ (equals(list1, list2) ? "" : " NOT") + "identical");
    }
    public static int[] createList(int length, Scanner input){
        int[] result = new int[length];
        for (int i = 0; i < result.length; i++) {
            result[i] = input.nextInt();
        }
        return result;
    }
    public static boolean equals(int[] list1, int[] list2){
        if(list1.length != list2.length)
            return false;
        for (int i = 0; i < list1.length; i++) {
            if(list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
