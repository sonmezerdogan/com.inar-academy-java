package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_02 {
    public static void main(String[]args){
        int numberOfQuestions=10;
        int correct = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);

        while (count < numberOfQuestions) {

            int n1 =(int) (Math.random() * 16);
            int n2 =(int) (Math.random() * 16);

            System.out.println("What is " + n1 + " - " + n2 + "? ");
            int answer = sc.nextInt();

            if (n1 - n2 == answer) {
                System.out.println("Correct answer!\n");
                correct++;

            } else {
                System.out.println("Wrong answer...");
                System.out.println("(Answer) " + n1 + " - " + n2 + " = " + (n1 - n2));

            }
            count++;
        }

        long endTime = System.currentTimeMillis();
        long totalTimeMillis = endTime - startTime;


        System.out.println("Total correct answers is : " + correct);
        System.out.println("Test time is : " + (totalTimeMillis / 1000) + " seconds.");
    }
}
