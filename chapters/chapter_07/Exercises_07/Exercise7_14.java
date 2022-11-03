package chapters.chapter_07.Exercises_07;

import java.util.Arrays;

public class Exercise7_14 {
    public static void main(String[] args) {
        int[] numbers ={9,15,30};
        System.out.println("The gcd is :"+ gcd(numbers));

    }
    public static int gcd(int[] numbers){
        Arrays.sort(numbers);
        int gcd =1;
        int k = 2;
        int i=0;
        while(k<=numbers[i])
            if(numbers[i] % k ==0 && numbers[i+1] % k ==0 && numbers[i+2] % k ==0){
                gcd=k;
                k++;
            }else
                k++;
        return gcd;

    }



}
