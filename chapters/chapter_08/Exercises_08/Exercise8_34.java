package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_34 {
    public static void main(String[] args) {

        double[][] points = new double[6][2];
        createArray(points);
        double[] rightMost = getRightmostLowestPoint(points);
        System.out.println("The rightmost lowest point is (" + rightMost[0] + ", " + rightMost[1] +")");


    }
    public static double[][] createArray(double[][] points) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coordinates of points: ");
        for (int row = 0; row <6 ; row++) {
            for (int col = 0; col <2 ; col++) {
                points[row][col]= input.nextDouble();
            }
        }
        return points;
    }
    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] result = new double[2];
        result[0] = points[0][0];
        result[1] = points[0][1];


        for (int i = 1; i < points.length; i++) {
            if((result[1] == points[i][1] && result[0] < points[i][0]) || result[1] > points[i][1]) {
                result[0] = points[i][0];
                result[1] = points[i][1];
            }
        }
        return result;
    }

}
