package chapters.chapter_11.Exercises_11.E09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        int[][] matrix = getRandomMatrix();
        ArrayList<Integer> rowWithMostOne = new ArrayList<>();
        ArrayList<Integer> columnWithMostOne = new ArrayList<>();

        sumOneInRows(matrix, rowWithMostOne);
        sumOneInColumns(matrix, columnWithMostOne);
        System.out.println(rowWithMostOne.toString());
        System.out.println(columnWithMostOne.toString());

        display(matrix);

        displayIndexRowWithMostOne(rowWithMostOne);
        displayIndexColumnWithMostOne(columnWithMostOne);
    }
    public static void displayIndexRowWithMostOne(ArrayList<Integer> list) {
        System.out.print("The index of the row with most 1 is : ");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(java.util.Collections.max(list))){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void displayIndexColumnWithMostOne(ArrayList<Integer> list) {
        System.out.print("The index of the column with most 1 is : ");
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(java.util.Collections.max(list))){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void sumOneInColumns(int[][] matrix, ArrayList<Integer> columnWithMostOne) {
        for (int i = 0; i < matrix.length; i++) {
            int colCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1) {
                    colCount++;
                }
            }
            columnWithMostOne.add(colCount);
        }
    }
    public static void sumOneInRows(int[][] matrix, ArrayList<Integer> rowWithMostOne) {
        for (int i = 0; i < matrix.length; i++) {
            int rowCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 1){
                    rowCount++;
                }
            }
            rowWithMostOne.add(rowCount);
        }
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] getRandomMatrix() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int size = input.nextInt();
        int[][] result = new int[size][size];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int)(Math.random()*2);
            }
        }
        return result;
    }
}
