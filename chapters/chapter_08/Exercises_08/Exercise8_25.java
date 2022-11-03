package chapters.chapter_08.Exercises_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_25 {
    public static void main(String[] args) {
        double[][] array = getInput();
        displayArray(array);
        System.out.println("It is " + (isMarkovMatrix(array) ? " a Markov Matrix " : "not a Markov Matrix "));

    }
    public static double[][] getInput(){
        Scanner input = new Scanner(System.in);

        double[][] array = new double[3][3];
        System.out.println("Degerleri gir ");

        for (int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }
    public static boolean checkPositive(double[][] array){
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                if(array[row][col] < 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkColumnSum(double[][] array) {
        int counter = 0;
        for(int col = 0; col < array[0].length; col++){
            double sum = 0;
            for(int row = 0; row < array.length; row++){
                sum += array[row][col];
            }
            if(sum == 1){
                counter++;
            }
        }
        return counter == array.length;
    }
    public static boolean isMarkovMatrix(double[][] array) {
        return checkPositive(array) && checkColumnSum(array);

    }
    public static void displayArray(double[][] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
