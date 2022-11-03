package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int numberOfStudents = input.nextInt();
        String[] names = new String[numberOfStudents];
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter the name of student " + (i+1));
            input.nextLine();
            names[i] = input.nextLine();
            System.out.print("Enter the score of student " + (i+1));
            scores[i] = input.nextInt();
        }
        namesInDecreasingScores(names, scores);
        displayNamesAndScores(names, scores);

    }
    public static void namesInDecreasingScores(String[] names, int[] scores){
        for (int i = 0; i < scores.length-1; i++) {
            int maxScore = scores[i];
            int maxScoreIndex = i;
            for (int j = i+1; j < scores.length; j++) {
                if (maxScore < scores[j]) {
                    maxScore = scores[j];
                    maxScoreIndex = j;
                }
            }
            if(maxScoreIndex != i){
                int temp = scores[i];
                scores[i] = scores[maxScoreIndex];
                scores[maxScoreIndex] = temp;
                String temp1 = names[i];
                names[i] = names[maxScoreIndex];
                names[maxScoreIndex] = temp1;
            }

        }

    }
    public static void displayNamesAndScores(String[] names, int[] scores){
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s:%3d\n", names[i], scores[i]);
        }
    }
}
