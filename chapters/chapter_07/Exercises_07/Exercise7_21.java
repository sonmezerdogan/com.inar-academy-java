package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of balls:");
        int numBalls = input.nextInt();
        System.out.println("Enter number of slots: ");
        int numSlots = input.nextInt();

        String[] paths = new String[numBalls];
        for (int i = 0; i < numBalls; i++) {
            paths[i] = pathBalls(numSlots);
        }
        displayBallPath(paths);
        int[] ballsInSlots = findNumberOfBallInSlots(paths, numSlots);
        displayballInSlots(ballsInSlots);
    }
    public static String pathBalls(int numSlots){
        String result = "";
        for (int i = 0; i < numSlots-1; i++) {
            int rightOrLeft = (int)(Math.random()*2);
            if(rightOrLeft == 0) {
                result += "R";
            } else {
                result+= "L";
            }
        }
        return result;
    }
    public static void displayBallPath(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.println("The ball "+ (i+1) + " >>> " + str[i]);
        }
    }
    public static int[] findNumberOfBallInSlots(String[] paths, int numslots){
        int[] slots = new int[numslots];
        for (int i = 0; i < paths.length; i++) {
            int count = 0;
            for (int j = 0; j < paths[i].length(); j++) {
                if(paths[i].charAt(j) =='R'){
                    count++;
                }
            }
            slots[count]++;
        }
        return slots;
    }
    public static void displayballInSlots(int[] numBalls){
        int max = getMax(numBalls);
        for (int i = max; i > 0 ; i--) {
            for (int j = 0; j < numBalls.length; j++) {
                if(numBalls[j] >=i){
                    System.out.print("0");
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < numBalls.length; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i=0; i < numBalls.length; i++){
            System.out.print((i+1)+"");
        }
    }
    public static int getMax(int[] list){
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if(list[i]>max)
                max = list[i];
            }
            return max;
        }


}
