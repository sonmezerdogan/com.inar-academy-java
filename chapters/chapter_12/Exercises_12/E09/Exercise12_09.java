package chapters.chapter_12.Exercises_12.E09;

import java.util.Scanner;

public class Exercise12_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary string");
        String binaryString = input.nextLine();
        try {
            System.out.println(binaryString + " (decimal form: " + binaryToDecimal(binaryString) + ")" + " is a valid binary string");
        } catch (NumberFormatException numberFormatException) {
            System.out.println(numberFormatException);
        }
    }
    public static int binaryToDecimal(String binaryString) {
        int decimalValue = 0;
        if (!charBinary(binaryString)) {
            throw new BinaryFormatException(binaryString);
        }
        char[] binaryChars = binaryString.toCharArray();
        for (int i = binaryChars.length-1, binaryIndex = 0; i >= 0; i--, binaryIndex++) {
            decimalValue += getBinaryValue(binaryChars[i], binaryIndex);
        }
        return decimalValue;
    }
    public static boolean charBinary(String binaryString) {
        char[] binaryStrValues = binaryString.toCharArray();
        for (char c : binaryStrValues) {
            if (c != '0' && c != '1') {
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
