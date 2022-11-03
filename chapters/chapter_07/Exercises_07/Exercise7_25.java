package chapters.chapter_07.Exercises_07;

import java.util.Scanner;

public class Exercise7_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a, b and c for \"ax^2 + bx = c\"");
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        if (solveDiscriminant(eqn) > 0) {
            System.out.println("The equation has 2 roots");
            System.out.println("Root 1 is " + getRoot1(eqn) + " Root 2 is " + getRoot2(eqn));
        } else if (solveDiscriminant(eqn) == 0 ) {
            System.out.println("The equation has 1 root\n" +
                    "Root is " + getRoot1(eqn));
        } else {
            System.out.println("The equation has no real root");
        }
    }
    public static double solveDiscriminant(double[] eqn) {
        return Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]);
    }

    public static double getRoot1(double[] eqn) {
        return (-eqn[1] + Math.sqrt(solveDiscriminant(eqn)))/ (2 * eqn[0]);
    }

    public static double getRoot2(double[] eqn) {
        return (-eqn[1] -  Math.sqrt(solveDiscriminant(eqn))) / (2 * eqn[0]);
    }
}
