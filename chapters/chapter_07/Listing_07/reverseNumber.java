package chapters.chapter_07;

import java.util.Arrays;

public class reverseNumber {
    public static void main(String[] args) {
        int[] list1={1,2,3,4,5,6,7};
        int[] list2= reverse(list1);
        System.out.print(Arrays.toString(list2));

    }
    public static int[] reverse(int[] list){

        int[] result= new int[list.length];
        for (int i = 0, j=result.length-1; i <list.length ; i++, j--) {
            result[j]= list[i];

        }
        return result;
    }
}
