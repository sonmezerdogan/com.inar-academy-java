package chapters.chapter_12.Exercises_12.E05;

import java.util.Scanner;

public class Exercise12_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        while (side1 + side2 >= side3 || side2 + side3 >= side1 || side1 + side3 >= side2) {
            try {
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Area of triangle : " + triangle.getArea());
                break;
            }catch (IllegalTriangleException ex){
                ex.printStackTrace();
            }
        }
    }
}
