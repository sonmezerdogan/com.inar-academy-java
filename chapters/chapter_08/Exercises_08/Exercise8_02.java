package chapters.chapter_08.Exercises_08;

import java.awt.*;
import java.util.Scanner;

public class Exercise8_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer for nxn matrix");
        int n = input.nextInt();
        System.out.println("Enter matrix row by row");
        double[][] matrix= new double[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.println(sumMajorDiagonal(matrix));

    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;

    }
}
