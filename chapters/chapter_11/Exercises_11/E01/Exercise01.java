package chapters.chapter_11.Exercises_11.E01;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Triangle triangle = getTriangle();
        System.out.println("Area of triangle = " +triangle.getArea()+
                "\nPerimeter of triangle = "+ triangle.getPerimeter()+
                "\nColour of triangle = " + triangle.getColor() +
                "\ntriangle is filled = " + triangle.isFilled());
    }
    public static Triangle getTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three sides for a triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter the color of triangle:");
        String colour = input.next();

        System.out.println("Enter whether the triangle is filled(true/false): ");
        boolean isFilled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(colour);
        triangle.setFilled(isFilled);

        return triangle;
    }
}
