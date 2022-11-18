package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        final int ARRAY_SIZE=10;
        int[] arr = new int[ARRAY_SIZE];

        fillArrayrandomly(arr);

        printArray(arr);

        int total= TotalofArray(arr);
        System.out.println(total);

        findMaxAndIndex(arr);

        randomShuffling(arr);
        printArray(arr);

        Shiftingelements(arr);
        printArray(arr);

        String[] months={"jan","feb","mar","apr","jun","jul","aug","sep","oct","nov","dec"};
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber= sc.nextInt();
        System.out.println("The month is "+months[monthNumber-1]);
    }

    private static void randomShuffling(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
    }

    private static void Shiftingelements(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            arr[arr.length - 1] = firstElement;

        }
    }

    private static void findMaxAndIndex(int[] arr) {
        int max = -1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("max number"+ " is " + max);
        System.out.println("index of max number is " + index);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void fillArrayrandomly(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
    }
    public static int TotalofArray(int[] arr){
        int total = 0;
        for (int number : arr) {
            total += number;
        }
        return total;
    }


}
