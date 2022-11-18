package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three lengths of sides for a triangle :");
        double s1=sc.nextDouble();
        double s2=sc.nextDouble();
        double s3=sc.nextDouble();
        if(isValid(s1,s2,s3)) {
            System.out.println("The area of the triangle is: " + area(s1, s2, s3));
        }else{
            System.out.println("The lengths of sides entered are Invalid");
        }

    }
    public static boolean isValid(double side1, double side2, double side3){
        if((side1+side2)<=side3){
            return false;
        }else if((side1+side3)<=side2){
            return false;
        }else if((side2+side3)<=side1) {
            return false;
        }else{
            return true;
        }
    }
    public static double area(double side1, double side2, double side3){
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

    }

}
