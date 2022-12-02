package chapters.chapter_12.Exercises_12.E07;

import java.util.Scanner;

public class Exercise12_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number as string");
        String binaryString = input.nextLine();
        try {
            System.out.println("Binary number " + binaryString + " is " + bin2Dec(binaryString) + " as a decimal");
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Runtime Exception Caught =>> "+ numberFormatException.getMessage());
        }
        input.close();
    }
    public static int bin2Dec(String binaryString) {
        int decimalValue = 0;
        if (!checkBinaryChars(binaryString)) {
            throw new NumberFormatException("Binary String contains invalid character(s)");
        }
        char[] binaryChars = binaryString.toCharArray();
        for (int i = binaryChars.length-1, binaryIndex = 0; i >=0 ; i--, binaryIndex++) {
            decimalValue += getBinaryValue(binaryChars[i], binaryIndex);
        }
        return decimalValue;
    }
    public static boolean checkBinaryChars(String binaryString) {
        char[] binaryStrValues = binaryString.toCharArray();
        for (int i = 0; i < binaryStrValues.length; i++) {

            if (binaryStrValues[i] != '0' && binaryStrValues[i] != '1') {
                return false;
            }

        }
        return true;
    }
    public static int getBinaryValue(char binaryChar, int index) {
        int stepValue = (int) Math.pow(2, index);
        if (binaryChar == '1') {
            return stepValue;
        }
        return 0;
    }
}
