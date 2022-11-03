package chapters.chapter_07.Exercises_07;

import java.util.Arrays;

public class Exercise7_02 {
    public static void main(String[] args) {
        int[] numbers = {2,5,7,3,5,8,4,9,1,6};
        int[] reverse =reverse(numbers);
        System.out.print(Arrays.toString(reverse));
    }

    public static int[] reverse(int[] numbers){
        int[] result = new int[numbers.length];
        for (int i = 0, j=numbers.length-1; i < numbers.length; i++, j--) {
            result[i] = numbers[j];
        }
        return result;
    }
}
