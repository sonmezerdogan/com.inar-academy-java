package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter number of rows and columns: ");
        int row= input.nextInt();
        int col= input.nextInt();
        int[][]array=new int[row][col];

        Exercise8_16.fillArray(array);

        System.out.println("\nbefore the shuffle the list is\n ");

        Exercise8_16.print(array);

        shuffle(array);

        System.out.println("\nafter shuffle the array is\n");

        Exercise8_16.print(array);

    }

    public static void shuffle(int[][] m){
        int temp;

        for (int i = 0; i <m.length ; i++) {

            int random=(int)(Math.random()*m.length);

            temp=m[i][0];
            m[i][0]=m[random][0];
            m[random][0]=temp;
        }
    }
}
