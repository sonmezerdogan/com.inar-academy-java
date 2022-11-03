package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class exercise8_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[][] array = new int[8][7];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the the weekly hours of employee -" + (i+1) + " day by day from Sunday to saturday");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        int[][] hours = new int[array.length][2];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
            hours[i][0] = i;
            hours[i][1] = sum;
        }
        getSort(hours);
        for (int i = 0; i < hours.length; i++) {
            System.out.println("the employee " + (hours[i][0]+1) + "  work hours is " + hours[i][1]);
        }
    }
    public static void getSort(int[][] hours) {
        for (int i = 0; i < hours.length; i++) {


            int maxCol0 = hours[i][0];
            int maxCol1 = hours[i][1];
            int maxIndex = i;

            for (int j = i + 1; j < hours.length; j++) {
                if (maxCol1 < hours[j][1]) {
                    maxCol1 = hours[j][1];
                    maxCol0 = hours[j][0];
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                hours[maxIndex][1] = hours[i][1];
                hours[maxIndex][0] = hours[i][0];
                hours[i][1] = maxCol1;
                hours[i][0] = maxCol0;
            }
        }
    }
}
