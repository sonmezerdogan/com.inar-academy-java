package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = input.nextInt();
        System.out.print("Enter column : ");
        int column = input.nextInt();

        int[][] matrix = createMatrixWithRandomValue(row, column);

        display(matrix);

        if (isConsecutiveFour(matrix)) {
            System.out.println("Matrix has a consecutive four");
        } else {
            System.out.println("Matrix has not a consecutive four");

        }
    }

    public static int[][] createMatrixWithRandomValue(int row, int column) {
        int[][] result = new int[row][column];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int) (Math.random() * 5);
            }
        }
        return result;
    }

    public static boolean isConsecutiveFour(int[][] value) {
        // row
        // column
        // diagonal
        // Right diagonal
        // Left diagonal
        if (isConsecutiveFourInRow(value)) {
            return true;
        }
        if (isConsecutiveFourInColumn(value)) {
            return true;
        }
        if (isConsecutiveFourInDiagonal(value)) {
            return true;
        }

        return false;
    }

    public static boolean isConsecutiveFourInRow(int[][] value) {

        for (int i = 0; i < value.length; i++) {

            int count = 1;

            for (int j = 0; j < value[i].length - 1; j++) {

                if (value[i][j] == value[i][j + 1]) {
                    count++;
                } else {
                    count = 1;
                }


                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourInColumn(int[][] value) {
        for (int i = 0; i < value[0].length; i++) {
            int count = 1;
            for (int j = 0; j < value.length - 1; j++) {
                if (value[j][i] == value[j + 1][i]) {
                    count++;
                } else {
                    count = 1;
                }

                if (count == 4) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFourInDiagonal(int[][] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[i].length; j++) {
                if (isLeftDiagonal(i, j, value)) {
                    return true;
                }
                if (isRightDiagonal(i, j, value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isLeftDiagonal(int row, int column, int[][] matrix) {
        if (row > matrix.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }

        int number = matrix[row][column];

        for (int i = 1; i < 4; i++) {
            if (number != matrix[row + i][column - i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRightDiagonal(int row, int column, int[][] matrix) {

        if (row >= matrix.length - 3) {
            return false;
        }
        if (column >= matrix[0].length - 3) {
            return false;
        }
        int number = matrix[row][column];

        int count = 1;

        for (int i = 1; i < 4; i++) {
            if (number == matrix[row + i][column + i]) {
                count++;
            }
        }

        if (count == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean hasConsecutiveFourInColumn(int[][] matrix, int row, int column) {
        if (row >= matrix.length - 3) {
            return false;
        }

        for (int i = row; i < row + 4; i++) {
            if (matrix[row][column] != matrix[i][column]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasConsecutiveFourInDiagonal(int[][] matrix, int row, int column) {
        // check right diagonal
        if (hasRightDiagonal(matrix, row, column)) {
            return true;
        }
        if (hasLeftDiagonal(matrix, row, column)) {
            return true;
        }
        return false;
    }

    private static boolean hasRightDiagonal(int[][] matrix, int row, int column) {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column >= matrix[row].length - 3) {
            return false;
        }

        for (int i = row, j = column; i < row + 4; i++, j++) {
            if (matrix[row][column] != matrix[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasLeftDiagonal(int[][] matrix, int row, int column) {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }


        for (int i = row, j = column; i < row + 4; i++, j--) {
            if (matrix[row][column] != matrix[i][j]) {
                return false;
            }
        }
        return true;
    }

}
