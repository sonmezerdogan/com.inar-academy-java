package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_05 {
    public static void main(String[] args) {
        int[] numbers = getFromUser();
        int[] distinctNumbers = new int[10];
        int countDistinctNumber = 0 ;

        for (int n = 0; n < numbers.length; n++) {
            if (contains(numbers[n], distinctNumbers, countDistinctNumber)){
                distinctNumbers[countDistinctNumber] = numbers[n];
                countDistinctNumber++;
            }
        }
        displayArray(distinctNumbers, countDistinctNumber);
    }
    public static void displayArray(int[] distinctNumbers, int countDistinctNumber) {
        System.out.println("Total number of distinct numbers : " + countDistinctNumber);

        for (int n = 0; n < countDistinctNumber; n++) {
            System.out.print(distinctNumbers[n] + " ");
        }
    }

    private static boolean contains(int number, int[] distinctNumbers, int countDistinctNumber) {
        for (int n = 0; n < countDistinctNumber; n++) {
            if (number == distinctNumbers[n]){
                return false;
            }
        }
        return true;
    }

    public static int[] getFromUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ten numbers: ");
        int[] arr = new int[10];

        for (int n = 0; n < arr.length; n++) {
            arr[n] = sc.nextInt();
        }

        return arr;
    }
}
