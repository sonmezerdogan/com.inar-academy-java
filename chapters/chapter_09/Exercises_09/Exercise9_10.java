package chapters.chapter_09.Exercises_09;

import java.util.Scanner;

public class Exercise9_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the values of a, b , and c");
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        display(equation);
    }
    public static void display(QuadraticEquation equation) {
        if(equation.getRoot1() == 0){
            System.out.println("No root");
        } else if (equation.getRoot1() == equation.getRoot2()) {
            System.out.println("one root: " + equation.getRoot1());
        }else
            System.out.println("Two roots: " + equation.getRoot1() + " and " + equation.getRoot2());
    }
}
