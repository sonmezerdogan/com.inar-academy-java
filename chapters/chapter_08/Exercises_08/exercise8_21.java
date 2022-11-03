package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class exercise8_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of cities");
        int numberOfCity = input.nextInt();
        double[][] coor = new double[numberOfCity][2];

        System.out.println("Enter the coordinates");
        for (int i = 0; i < coor.length; i++) {
            coor[i][0] = input.nextDouble();
            coor[i][1] = input.nextDouble();
        }
        double[][] arr = distance(coor);
        double[] sumOfDistance = new double[arr.length];

        for (int i = 0; i < sumOfDistance.length; i++) {
            for (int j = 0; j < sumOfDistance.length; j++) {

                sumOfDistance[i] += arr[i][j];
            }
        }
        int indexMin = indexMinDistance(sumOfDistance);
        System.out.println("The central city is at ("+ coor[indexMin][0]+" , "+ coor[indexMin][1]+")");
        System.out.printf("And the total distance to all other cities is " + "%.2f",sumOfDistance[indexMin]);

    }
    public static int indexMinDistance(double[] arr) {
        int index = 0;
        double minDistance = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (minDistance > arr[i]) {
                minDistance = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static double[][] distance(double[][] arr) {
        double[][] distance = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                double x1 = arr[i][0];
                double y1 = arr[i][1];
                double x2 = arr[j][0];
                double y2 = arr[j][1];

                distance[i][j] = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)), 0.5);
            }
        }
        return distance;
    }
}
