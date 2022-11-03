package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_05 {
    public static void main(String[] args) {
        double[][] arr1 = createArray();
        double[][] arr2 = createArray();

        double[][] sumOfArrays = addMatrix(arr1,arr2);
        printArray(arr1, arr2, sumOfArrays);
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

    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] sumMatrix = new double[3][3];
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                sumMatrix[i][j] = (a[i][j] + b[i][j]);                
            }            
        }
        return sumMatrix;
    }
    public static double[][] createArray(){
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
