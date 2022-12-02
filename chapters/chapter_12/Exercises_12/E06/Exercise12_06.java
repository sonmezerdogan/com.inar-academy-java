package chapters.chapter_12.Exercises_12.E06;

import java.util.Scanner;

public class Exercise12_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  a hex number");
        String hexNumber = input.next();

        try {
            System.out.println("Deciamal value for hex1 " + hexNumber + " is " + Hex2Dec.hexToDecimal(hexNumber.toUpperCase()));
        }catch (NumberFormatException ex) {
            System.out.println(ex);
        }



    }
}
