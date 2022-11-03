package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

import static java.lang.System.arraycopy;

public class Exercise7_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[100];

        System.out.println("Enter scores :");
        int count = 0;
        int sum = 0;
        for (int i=0; count<=scores.length; i++) {
            scores[i] = sc.nextInt();
            count++;
            sum+=scores[i];
            if (scores[i] < 0) break;
        }
        int[] trimmedArray = new int[count];
        int average = findAverage(sum, count);
        int aboveAverage= findAboveAverage(scores,average);
        int belowAverage = count-aboveAverage;
        System.out.println(aboveAverage+" scores are above/equal average "+average);
        System.out.println(belowAverage+" scores are below average "+average);

    }
    public static int findAverage(int sum, int count){
        return sum/count;
    }
    public static int findAboveAverage(int[] scores, int average){
        int countAbove=0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i]>=average){
                countAbove++;
            }
        }
        return countAbove;
    }

}


