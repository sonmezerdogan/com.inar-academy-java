package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points");
        int numberOfPoints = input.nextInt();

        double[][] points = new double[numberOfPoints][3];
        System.out.println("Enter " + numberOfPoints + " " +
                "points");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
            points[i][2] = input.nextDouble();
        }
        int p1 = 0, p2 = 1;
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p1][2], points[p2][0], points[p2][1],
                points[p2][2]);

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[i][2], points[j][0], points[j][1],
                        points[j][2]);

                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("The closest two points are " + "("+ points[p1][0]+","+points[p1][1]+","+points[p1][2]+") and ("+
                 points[p2][0] + "," + points[p2][1] + "," + points[p2][2] + ")");
    }
    public static double distance(double x1, double y1, double x2, double y2, double z1, double z2){
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) + (z2 -z1) * (z2 - z1));
    }
}
