package chapters.chapter_05;
import java.util.Scanner;
public class Exercise5_09 {

    public static void main(String[]args){

        double highScore = 0, secondHigh = 0;

        String highName = "";
        String secondName = "";
        String tempName = "";
        double tempScore = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        int numStudents = sc.nextInt();

        System.out.print("Enter a students name: ");
        highName = sc.next();

        System.out.print("Enter the students score: ");
        highScore = sc.nextDouble();

        while (numStudents > 1) {
            System.out.print("Enter a students name: ");
            tempName = sc.next();

            System.out.print("Enter the students score: ");
            tempScore = sc.nextDouble();

            if (tempScore > highScore) {
                secondHigh = highScore;
                secondName = highName;
                highScore = tempScore;
                highName = tempName;
                numStudents--;
                continue;
            }

            if (tempScore < highScore && tempScore > secondHigh) {
                secondHigh = tempScore;
                secondName = tempName;
            }
            numStudents--;

        }

        System.out.println(highName + " has the highest score with: "  + highScore);
        System.out.println(secondName + " has the second highest score with:  " + secondHigh);

    }
}
