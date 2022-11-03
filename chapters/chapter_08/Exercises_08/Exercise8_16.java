package chapters.chapter_08.Exercises_08;

import java.util.Scanner;

public class Exercise8_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter row's and col's length: ");
        int row= input.nextInt();
        int col= input.nextInt();
        int[][]array=new int[row][col];

        fillArray(array);

        System.out.println("before the sort the array is like that:\n ");
        print(array);
        sort(array);
        System.out.println("\nafter the sort the array is like that:\n ");
        print(array);
    }

    public static void fillArray(int[][]arr){
        System.out.println("enter array");
        Scanner input=new Scanner(System.in);
        for (int row = 0; row < arr.length ; row++) {//fill array row by row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]= input.nextInt();
            }
        }

    }

    public static void sort(int arr[][]){
        for (int row = 0; row < arr.length ; row++) {
            int min0=arr[row][0];
            int min1=arr[row][1];
            int index=row;
            for (int i = row+1; i < arr.length ; i++) {
                if (arr[i][0]<min0 || (arr[i][1]<min1 && arr[i][0]==min0)){
                    min0=arr[i][0];
                    min1=arr[i][1];
                    index=i;

                }
            }

            if (index!=row){
                arr[index][0]=arr[row][0];
                arr[index][1]=arr[row][1];
                arr[row][0]=min0;
                arr[row][1]=min1;
            }

        }



    }

    public static void print(int[][]arr){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+" ");

            }
            System.out.print("    ");

        }

    }

}
