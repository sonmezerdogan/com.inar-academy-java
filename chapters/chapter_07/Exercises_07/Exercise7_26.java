package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of list1 and numbers:");
        int[] array1 = createArray(input.nextInt(), input);
        System.out.println("Enter the length of list2 and numbers:");
        int[] array2 = createArray(input.nextInt(), input);

        System.out.println("The lists are "+ (equals(array1, array2) ? "" : "not ") + "strictly identical");
    }
    public static int[] createArray(int listLength, Scanner input){
        int[] list = new int[listLength];
        for (int i = 0; i < listLength; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }
    public static boolean equals(int[] array1, int[] array2){
        if(array1.length != array2.length)
            return false;
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i])
                return false;
            }
        return true;
    }

}
