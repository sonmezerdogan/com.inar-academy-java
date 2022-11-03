package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_15 {
    public static void main(String[] args) {

        double[][] points = getPoints();
        System.out.println("All points are "+ (onTheSameLine(points) ? "" : "not") + " on the same line");
    }
    public static double[][] getPoints() {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        System.out.println("Enter five points");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        return points;
    }
    public static boolean onTheSameLine(double[][] points) {
        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];

        for (int i = 2; i < points.length; i++) {
            if (((x2 - x1) * (points[i][1] - y1)) - ((points[i][0] - x1) * (y2 - y1)) != 0)
                return false;
        }
        return true;
    }

}
