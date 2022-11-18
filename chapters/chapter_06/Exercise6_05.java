package chapters.chapter_06;

import java.util.Scanner;

public class Exercise6_05 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Enter three double numbers ; ");
        num1= sc.nextDouble();
        num2= sc.nextDouble();
        num3= sc.nextDouble();
        OrderOfNumbers(num1, num2, num3);
    }
    public static void OrderOfNumbers(double num1, double num2, double num3){
        if(num1<num2&&num2<num3) {
            System.out.print(num1+" < "+num2+" < "+num3);
        }else if(num1<num2&&num3<num2){
            System.out.print(num1+" < "+num3+" < "+num2);
        }else if(num2<num1&&num1<num3){
            System.out.print(num2+" < "+num1+" < "+num3);
        }else if(num2<num3&&num3<num1){
            System.out.print(num2+" < "+num3+" < "+num1);
        }else if(num3<num1&&num1<num2){
            System.out.print(num3+" < "+num1+" < "+num2);
        }else
            System.out.print(num3+" < "+num2+" < "+num1);

    }
}
