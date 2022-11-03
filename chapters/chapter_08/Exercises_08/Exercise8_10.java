package chapters.chapter_08.Exercises_08;

public class Exercise8_10 {
    public static void main(String[] args) {
        int[][] arr= createArray();
        int rowIndex = largestRowIndex(arr);
        int colIndex = largestColIndex(arr);
        printArray(arr);
        System.out.println("The largest row within 1 is: "+ rowIndex);
        System.out.println("The largest column within 1 is: "+ colIndex);
    }

    public static int[][] createArray() {
        int[][] matrix = new int[4][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }
    public static int largestRowIndex(int[][] matrix) {
        int caunt;
        int occurrenceOf1 = Integer.MIN_VALUE;
        int indexRowMaxOf1 = -1;

        for (int row = 0; row < matrix.length; row++) {
            caunt = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (matrix[row][col] == 1) {
                    caunt++;
                }
            }
            if (caunt >= occurrenceOf1) {
                occurrenceOf1 = caunt;
                indexRowMaxOf1 = row;
            }
        }
        return indexRowMaxOf1;
    }
    public static int largestColIndex(int[][] matrix) {
        int count;
        int occurrenceOf1 = Integer.MIN_VALUE;
        int indexColMaxOf1 = -1;

        for (int col = 0; col < matrix.length; col++) {
            count = 0;
            for (int row = 0; row < matrix.length; row++) {
                if (matrix[row][col] == 1) {
                    count++;
                }
            }
            if (count >= occurrenceOf1) {
                occurrenceOf1 = count;
                indexColMaxOf1 = col;
            }
        }
        return indexColMaxOf1;
    }
    public static void printArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
