package chapters.chapter_09.Exercises_09;

import java.util.Scanner;

public class Exercise9_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter row >>");
        int row = input.nextInt();
        System.out.println("Enter column >>");
        int column = input.nextInt();

        double[][] array = getArray(input, row, column);
        getDisplay(array);

        Location location = locateLargest(array);
        location.print();
    }

    private static void getDisplay(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4.1f ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static double[][] getArray(Scanner input, int row, int column) {
        double[][] array = new double[row][column];
        System.out.println("Enter values row by row >>");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
    public static Location locateLargest(double[][] a) {
        int row = -1;
        int column = -1;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(maxValue < a[i][j]){
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        Location location = new Location(row, column, maxValue);
        return location;
    }
}
