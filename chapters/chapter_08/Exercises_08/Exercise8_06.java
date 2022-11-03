package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_06 {
    public static void main(String[] args) {
        double[][] arr1 = createArray();
        double[][] arr2 = createArray();

        double[][] multiplyOfArrays = multiplyMatrix(arr1,arr2);
        printArray(arr1, arr2, multiplyOfArrays);
    }

    public static void printArray(double[][] arr1, double[][] arr2, double[][] sumOfArrays) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%-3.1f ",arr1[i][j]);
            }
            if(i ==1){
                System.out.printf("%5s", "  +  ");
            } else {
                System.out.printf("%5s", " ");
            }
            for (int j = 0; j < arr2.length; j++) {
                System.out.printf("%-3.1f",arr2[i][j]);
            }
            if(i == 1){
                System.out.printf("%5s"," = ");
            } else {
                System.out.printf("%5s"," ");
            }
            for (int j = 0; j < sumOfArrays.length; j++) {
                System.out.printf("%-3.1f ",sumOfArrays[i][j]);
            }
            System.out.println();
        }

    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b){

        double[][] multiplyMatrix = new double[3][3];
        for (int i = 0; i < multiplyMatrix.length; i++) {
            for (int j = 0; j < multiplyMatrix[i].length; j++) {
                multiplyMatrix[i][j] = (a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]);
            }
        }
        return multiplyMatrix;
    }
    public static double[][] createArray() {
        Scanner input = new Scanner(System.in);
        double[][] arr = new double[3][3];
        System.out.println("Enter a matrix with 3x3 ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        return arr;
    }
}
