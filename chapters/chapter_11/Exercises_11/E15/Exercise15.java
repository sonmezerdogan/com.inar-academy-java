package chapters.chapter_11.Exercises_11.E15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        ArrayList<Double> points = getFromUser();
        double area = findArea(points);
        System.out.printf("The aria of convex polygon is : %.3f", area);
    }
    public static ArrayList<Double> getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points");
        int number = input.nextInt();

        ArrayList<Double> points = new ArrayList<>();
        System.out.println("Enter the x and y values of the points");
        for (int i = 0; i < number*2; i++) {
            points.add(input.nextDouble());
        }
        return points;
    }
    public static double findArea(ArrayList<Double> points) {
        double sum = 0;
        for (int i = points.size() - 1; i >= 3; i -= 2) {
            double x1 = points.get(i);
            double y1 = points.get(i - 1);
            double x2 = points.get(i - 2);
            double y2 = points.get(i - 3);
            sum += ((x1 * y2) - (y1 * x2));
        }
        sum += (points.get(points.size() - 2) * points.get(1)) - (points.get(points.size() - 1) * points.get(0));
        return Math.abs(sum / 2);
    }
}
