package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 by 4 matrix ");
        double[][] m = new double[3][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        for (int j = 0; j < m[0].length; j++) {
            double sum = sumColumn(m, j);
            System.out.println("sum of column " + (j + 1) + ">>> " + sum);
        }
    }
    public static double sumColumn(double[][] m, int columnIndex){
    double sum= 0;
    for (int i = 0; i < m.length; i++) {
        sum += m[i][columnIndex];
    }
    return sum;
    }
}
