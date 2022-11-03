package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter teh number of students :");
        int numberOfStudents = sc.nextInt();
        int[] scores = new int[numberOfStudents];
        char[] grades = new char[numberOfStudents];
        System.out.println("Enter scores :");
        for (int i = 0; i < scores.length; i++)
            scores[i] = sc.nextInt();
        getgrades(scores,grades);
        displayGrades(scores,grades);
    }
    public static int max(int[] scores){
        int max = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }
    public static void getgrades(int[] scores, char[] grades){
        int gradeMax = max(scores);
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= gradeMax-10){
                grades[i] = 'A';
            } else if(scores[i] >= gradeMax-20){
                grades[i] = 'B';
            } else if(scores[i] >= gradeMax-30){
                grades[i] = 'C';
            } else if(scores[i] >= gradeMax-40){
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
    public static void displayGrades(int[] scores, char[] grades){
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student "+i+" score "+ scores[i]+" and "+ "grade is "+grades[i]);
        }
    }
}
